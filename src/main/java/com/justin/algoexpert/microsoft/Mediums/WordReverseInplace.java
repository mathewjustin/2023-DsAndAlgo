package com.justin.algoexpert.microsoft.Mediums;

/**
 * @author Justin Mathew @dev_io
 * 186. Reverse Words in a String II
 */
public class WordReverseInplace {

    public static void main(String[] args) {
        char[] chars = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        reverseWords(chars);
        System.err.println(chars);
     }

    private static void reverseWordsInAString(char[] s) {


        int n=s.length;
        int left=0;
        int end=0;
        while (left<n)
        {
            while (end<n&&s[end]!=' ') end++;

            reverse(s,left,end-1);

            left=end+1;
            end++;

        }



    }

    public static void reverseWords(char[] s) {

        reverse(s,0,s.length-1);

        reverseWordsInAString(s);
    }

    private static void reverse(char[] s,int left , int right) {


        char temp;
        while (left<right)
        {
            temp=s[right];
            s[right--]=s[left];
            s[left++]=temp;
        }

    }

}
