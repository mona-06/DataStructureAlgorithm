package com.MiniProject2;

import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.nio.file.*;


public class LogAnalyzer {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        File folder = new File("logs");
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("Log folder not found or empty: " + folder.getAbsolutePath());
            return;
        }

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        ExecutorService pool = Executors.newFixedThreadPool(4);
        List<Callable<Void>> tasks = new ArrayList<>();

        for (File f : files) {
            tasks.add(() -> {
                List<String> lines = Files.readAllLines(f.toPath());
                lines.stream()
                        .flatMap(line -> Arrays.stream(line.split("\\s+")))
                        .forEach(word -> map.merge(word, 1, Integer::sum));
                return null;
            });
        }

        pool.invokeAll(tasks);
        pool.shutdown();

        long end = System.currentTimeMillis();

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

        PrintWriter out = new PrintWriter("result.txt");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> out.println(e.getKey() + " = " + e.getValue()));
        out.println("Time: " + (end - start) + " ms");
        out.close();

        System.out.println("Time: " + (end - start) + " ms");
    }
}