package com.DAY9.CW.QuickSort;

import java.util.Arrays;

import static java.util.Collections.swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {10, 16, 8, 12, 15, 6, 3, 9, 5, 75};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int j = partition(nums, start, end);
            quickSort(nums, start, j - 1);
            quickSort(nums, j + 1, end);
        }
    }

    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int i = start;
        int j = end;

            if(i<=j){
                swap(nums, i, j);
            }
            while (nums[i] <= pivot && i <= j) {
                i++;
            }
            while (nums[j] >= pivot && i <= j) {
                j--;
            }
            if(i <= j){
                swap(nums, i, j);
            }
        swap(nums,j,start);
        return j;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
