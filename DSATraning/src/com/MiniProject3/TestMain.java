package com.MiniProject3;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {

        int[] arr1 = {5, 2, 9, 1, 3};
        long time = AnalysisUtil.measureTime(() -> SortingUtil.bubbleSort(arr1));
        System.out.println("Bubble Sort: " + Arrays.toString(arr1) + " Time: " + time);

        int[] arr2 = {8, 4, 6, 2, 7};
        time = AnalysisUtil.measureTime(() -> SortingUtil.quickSort(arr2));
        System.out.println("Quick Sort: " + Arrays.toString(arr2) + " Time: " + time);

        System.out.println("Linear Search index: " + SearchUtil.linearSearch(arr2, 6));
        System.out.println("Binary Search index: " + SearchUtil.binarySearch(arr2, 7));

        CollectionUtil.Stack<Integer> s = new CollectionUtil.Stack<>();
        s.push(10);
        s.push(20);
        System.out.println("Stack pop: " + s.pop());

        CollectionUtil.Queue<String> q = new CollectionUtil.Queue<>();
        q.enqueue("A");
        q.enqueue("B");
        System.out.println("Queue dequeue: " + q.dequeue());
    }
}
