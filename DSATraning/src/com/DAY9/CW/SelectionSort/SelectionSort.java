package com.DAY9.CW.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {8,5,7,3,2};
        int n=nums.length;
        for (int i = 0;i<n-1; i++) {
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
