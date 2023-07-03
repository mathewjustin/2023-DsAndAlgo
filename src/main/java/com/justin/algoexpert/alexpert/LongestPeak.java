package com.justin.algoexpert.alexpert;

/**
 * @author Justin Mathew @dev_io
 */
public class LongestPeak {

    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        System.err.println(longestPeak(array));
    }

    private static int longestPeak(int[] array) {
    int longPeakLength=0;
    int i=1;
    while(i<array.length-1)
    {

        boolean isPeak=array[i-1] <array[i] && array[i]>array[i+1];
        if(!isPeak)
        {
            i++;
            continue;
        }
        //We found a peak here.
        //now expand to left and right

        int leftIndex=i-2; //I already know i-1 is going to be less
        while(leftIndex >=0 && array[leftIndex] < array[leftIndex+1]){
            leftIndex--;
        }

        int rightIndex=i+2; //I already know i+1 is decreasing

        while(rightIndex<array.length && array[rightIndex]<array[rightIndex-1])
        {
            rightIndex++;
        }
        int curPeakLength=rightIndex-leftIndex-1;
        if(curPeakLength>longPeakLength){
            longPeakLength=curPeakLength;
        }
        i=rightIndex;

    }
     return longPeakLength;


    }
}
