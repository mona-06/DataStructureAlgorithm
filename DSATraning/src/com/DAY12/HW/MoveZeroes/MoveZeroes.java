package com.DAY12.HW.MoveZeroes;
import java.util.*;
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int idx = 0;

        for (int n : nums)
            if (n != 0) nums[idx++] = n;

        while (idx < nums.length) nums[idx++] = 0;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
