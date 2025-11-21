package com.MiniProject3;

public class SearchUtil {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
