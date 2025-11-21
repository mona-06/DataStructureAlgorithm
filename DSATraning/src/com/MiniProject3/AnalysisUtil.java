package com.MiniProject3;

public class AnalysisUtil {
    public static long measureTime(Runnable algorithm) {
        long start = System.nanoTime();
        algorithm.run();
        return System.nanoTime() - start;
    }
}
