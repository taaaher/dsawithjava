package dsaWithJava.functions.Array;
//https://leetcode.com/problems/group-anagrams/description/

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println(ans);
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        //Map which takes String as the key and List of String as the values.
        Map<String,List<String>> map = new HashMap<>();
        //Iterating the strs array
        for(String s: strs){
            //Initializing an array to keep the track of each occurrence of the character.
            int[] hash = new int[26];
            //iterating over the characters of string element to mark the occurrence of each character.
            for(char c: s.toCharArray()){
                hash[c-'a']++;
            }
            //converting the hash array with frequency of character to string
            String key = Arrays.toString(hash);
            //If the key is absent create a new key in the map
            map.computeIfAbsent(key, k->new ArrayList<>());
            //add the string to it's respective key
            map.get(key).add(s);
        }
        //Combine all the values inside the map and return.
        res.addAll(map.values());
        return res;
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        //Brute force Approach takes O(N*2).
        //array to keep track of visited string in the array.
        int[] visited = new int[strs.length];
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            //If the element is not visited then make a new list and add value
            if (visited[i] == 0) {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);

                for (int j = i + 1; j < strs.length; j++) {
                    //If the element is visited ignore it
                    if (visited[j] == 1) {
                        continue;
                    }
                    //check for anagram if true add in temp and mark the visited array.
                    if (isAnagram(strs[i], strs[j])) {
                        visited[j] = 1;
                        temp.add(strs[j]);
                    }
                }
                //Add the array to the final answer once the internal loop is over.
                ans.add(temp);
            }
        }
        return ans;
    }


    static boolean isAnagram(String s, String t) {
        boolean ans = true;
        //Array to keep track of characters in the strings.
        int[] alphabet = new int[26];
        //edge condition if the lengths of the strings differ return false.
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            //increment the alphabet position if it is present in s
            alphabet[s.charAt(i)-'a']++;
            //decrement the alphabet if present in t
            alphabet[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < alphabet.length; i++) {
            //If the array has any non-zero element return false.
            if(alphabet[i] != 0){
                return false;
            }
        }
        return ans;
    }
}
