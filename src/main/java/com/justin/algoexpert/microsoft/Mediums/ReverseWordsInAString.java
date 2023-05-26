package com.justin.algoexpert.microsoft.Mediums;

/**
 * @author Justin Mathew @dev_io
 */
public class ReverseWordsInAString {

        public static void main(String[] args) {

            System.err.println(reverseWords("the sky is blue"));
        }

        public static String reverseWords(String s) {
            String[] words = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i=words.length-1;i>=0;i--)
            {
                if(!words[i].equals(""))
                {
                    sb.append(words[i]);
                    sb.append(" ");
                }
            }
            return sb.toString().trim();
        }
}
