package com.MiniProject3;

import java.util.*;

public class CollectionUtil {
    public static class Stack<T> {
        private ArrayList<T> list = new ArrayList<>();

        public void push(T item) { list.add(item); }
        public T pop() { return list.remove(list.size() - 1); }
        public T peek() { return list.get(list.size() - 1); }
        public boolean isEmpty() { return list.isEmpty(); }
    }

    public static class Queue<T> {
        private ArrayList<T> list = new ArrayList<>();

        public void enqueue(T item) { list.add(item); }
        public T dequeue() { return list.remove(0); }
        public T peek() { return list.get(0); }
        public boolean isEmpty() { return list.isEmpty(); }
    }
}
