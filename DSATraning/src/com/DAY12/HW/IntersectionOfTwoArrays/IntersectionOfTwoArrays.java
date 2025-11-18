package com.DAY12.HW.IntersectionOfTwoArrays;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);

        HashSet<Integer> result = new HashSet<>();
        for (int n : nums2) if (set1.contains(n)) result.add(n);

        int[] ans = new int[result.size()];
        int i = 0;
        for (int r : result) ans[i++] = r;

        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
