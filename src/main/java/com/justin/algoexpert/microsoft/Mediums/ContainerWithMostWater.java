package com.justin.algoexpert.microsoft.Mediums;

/**
 * @author Justin Mathew @dev_io
 * 2 pointer approach kind of simple..
 */
public class ContainerWithMostWater {

public int maxArea(int[] height)
{

    int max=0;

    int leftPointer=0;
    int rightPointer=height.length-1;

    while(leftPointer<rightPointer)
    {

        int currentArea= Math.min(height[leftPointer],height[rightPointer]) * (rightPointer-leftPointer);
        max=Math.max(max,currentArea);
        if(height[leftPointer]<=height[rightPointer])
        {
            leftPointer++;
        }else {
            rightPointer--;
        }
    }
    return max;
}

}
