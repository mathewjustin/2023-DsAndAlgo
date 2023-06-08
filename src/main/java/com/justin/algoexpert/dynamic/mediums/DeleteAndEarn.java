package com.justin.algoexpert.dynamic.mediums;

import java.util.HashMap;

/**
 * @author Justin Mathew @dev_io
 */
public class DeleteAndEarn {

    private static HashMap<Integer, Integer> points = new HashMap<>();
    private static HashMap<Integer, Integer> cache = new HashMap<>();

    private static int maxPoints(int num) {
        // Check for base cases
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return points.getOrDefault(1, 0);
        }

        if (cache.containsKey(num)) {
            return cache.get(num);
        }

        // Apply recurrence relation
        int gain = points.getOrDefault(num, 0);//gain is the points we get from taking the current element
        cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));//wither take the current element or skip it, in case you skip it you will get the max points from the previous element
        return cache.get(num);
    }

    public static int deleteAndEarn(int[] nums) {
        int maxNumber = 0;

        // Precompute how many points we gain from taking an element
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }

        return maxPoints(maxNumber);
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 3, 3, 4};
        System.out.println(deleteAndEarn(nums));
    }

}
