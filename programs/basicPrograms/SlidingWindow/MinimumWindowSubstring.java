package dsaWithJava.functions.SlidingWindow;
//https://leetcode.com/problems/minimum-window-substring/description/

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s1 = "ADOBECODEBANC";
        String s2 = "ABC";
        String sol = minWindow(s1,s2);
        System.out.println(sol);
    }

    static String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
//        getting the frequency of characters from string t.
        for(char c : t.toCharArray()){
            map.put(c ,map.getOrDefault(c,0) + 1);
        }
        int start = 0;
        int minLen = s.length() + 1; // setting the initial length to infinity.
        int matched = 0;
        int subStr = 0;

        for (int end = 0; end < s.length(); end++) {
            char r = s.charAt(end);
//            if the element is present in map then decrease it counter
            if(map.containsKey(r)){
                map.put(r, map.get(r)-1);
//                if the element is the desired element then increase the match counter.
                if(map.get(r) == 0){
                    matched++;
                }
            }
//            if the sliding window contians all the required characters then resize the window.
            while(matched == map.size()){
//                update the minLen of the new window.
                if(minLen > end-start+1){
                    minLen = end-start+1;
                    subStr = start;
                }
//                catch the character which will be deleted from the front.
                char deleted = s.charAt(start++);
//                if it is part of the map then decrease the match count and update the its frequency in the map.
                if(map.containsKey(deleted)){
                    if(map.get(deleted) == 0){
                        matched--;
                    }
                    map.put(deleted, map.get(deleted)+1);
                }
            }
        }
//        if the minLen is greater than first string then return empty string, else return the last sliding window containing the solution.
        return minLen > s.length()? "" : s.substring(subStr, subStr+minLen);
    }

}
