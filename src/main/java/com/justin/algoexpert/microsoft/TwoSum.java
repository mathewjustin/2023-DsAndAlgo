package com.justin.algoexpert.microsoft;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Justin Mathew @dev_io
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * [0,0,7,0,0,0,0,7]
 *
 * 9-2=7
 *
 */
public class TwoSum {

    public static void main(String[] args) {

        twoSum(new int[]{2,7,11,15},9 );


    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>cache=new HashMap<>();
        int[] ints = new int[0];
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(cache.containsKey(complement))
            {
                ints = new int[]{cache.get(complement), i};
            }
            cache.put(nums[i],i);
        }
        return ints;
    }
}
