package com.DAY9.HW.MoveAllZerosToRight;

import java.util.Arrays;

public class MoveAllZerosToRight {
    public static void main(String[] args) {
        int[] nums={3,0,2,6,0,5,0,9};
        int n=nums.length;
        moveAllZerosToRight(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveAllZerosToRight(int[] nums){
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while(j<n){
            nums[j++]=0;
        }

    }

}
