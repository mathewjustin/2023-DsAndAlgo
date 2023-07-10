package com.justin.algoexpert.microsoft.Mediums;

import java.util.*;

/**
 * @author Justin Mathew @dev_io
 */
public class AnagramGrouping {

    public static void main(String[] args) {
        String[] inputs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.err.println(groupAnagrams(inputs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);//char array is now sorted.
            String key=String.valueOf(chars);
            if(!ans.containsKey(key)) ans.put(key,new ArrayList<>()); //What we need to return? its a list of lits
            ans.get(key).add(str);
        }
        return new ArrayList(ans.values());
     }
}
