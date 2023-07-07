package com.justin.algoexpert.microsoft.Mediums;

/**
 * @author Justin Mathew @dev_io
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 */
public class LongestPalindromicSubString {

    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {
        int n=s.length();
        boolean [][] dp =new boolean[n][n];
        int ans[] = new int[]{0,0};

        //Fill diagonaly.
        //Diagonal elements on the dp array will be refering to itself so it is palindrome.
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        //Fill Diagonal +1
        //It is easy just need to check char at 1 and i+1 are equal

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                ans[0] = i;
                ans[1] = i + 1;
            }
        }
        //Since we filled diagonal and diagonal+1 we start from 2
        //Equation will be subs(i,j) => str(i)==str(j) && dp[i+1][j-1]==true
        for (int diff = 2; diff < n; diff++) {
            for (int i = 0; i < n - diff; i++) {
                int j = i + diff;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        int i = ans[0];
        int j = ans[1];
        return s.substring(i, j + 1);
    }
}
