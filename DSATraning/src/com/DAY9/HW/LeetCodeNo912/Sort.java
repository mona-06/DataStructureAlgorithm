package com.DAY9.HW.LeetCodeNo912;
import java.util.*;

public class Sort {
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                res[k++] = left[i++];
            } else {
                res[k++] = right[j++];
            }
        }

        while (i < left.length) res[k++] = left[i++];
        while (j < right.length) res[k++] = right[j++];

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        nums = sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
