package com.justin.algoexpert.microsoft.Simple;

/**
 * @author Justin Mathew @dev_io
 * Reverse a string array in place with O(1) space complexity
 */
public class ReverseInPlace {

    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.err.println(chars);

    }

    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++)
        {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;

          }
    }

}
