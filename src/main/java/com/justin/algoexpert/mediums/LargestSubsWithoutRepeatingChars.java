package com.justin.algoexpert.mediums;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Justin Mathew @dev_io
 */
public class LargestSubsWithoutRepeatingChars {

    public static int lengthOfLongestSubstring(String s) {


        int leftPointer = 0;
        int rightPointer = 0;
        Set<Character> cache = new HashSet<>();

        int maxLength = 0;
        while (rightPointer < s.length()) {
            if (!cache.contains(s.charAt(rightPointer))) {
                cache.add(s.charAt(rightPointer++));
                maxLength = Math.max(maxLength, rightPointer - leftPointer);

            } else {
                cache.remove(s.charAt(leftPointer++));
            }

        }

        return maxLength;

    }

    //write a method which performs addition of two linked lists

    public int add(int a, int b)
    {
        return a+b;
    }



    public static void main(String[] args) {

        System.err.println(lengthOfLongestSubstring("abcabcdbb"));

    }
}
