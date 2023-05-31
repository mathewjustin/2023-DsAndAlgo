package com.justin.algoexpert.microsoft.Simple;

/**
 * @author Justin Mathew @dev_io
 * This is using moore's voting algorithm. Picked up from Striver's youtube channel.
 */
public class MajorityOfArray {


    public static void main(String[] args) {

        System.err.println(majorityElement(new int[]{3,3,4}));

    }

    public static int majorityElement(int[] nums) {

        int count=0;
        int elem=0;
        for(int i=0;i<nums.length;i++)
        {

            if(count==0)
            {
                count=1;
                elem=nums[i];
            }
            else if(elem==nums[i])
            {
              count++;
            }
            else{
                count--;
            }

        }
        count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(elem==nums[i])
            {
                count++;
            }
        }
        if(count>nums.length/2)
        {
            return elem;
        }
        return -1;
    }
}
