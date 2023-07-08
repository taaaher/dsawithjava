package dsaWithJava.functions.Array;

//https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "a", t = "ab";
        boolean sol = isAnagram(s,t);
        System.out.println(sol);

    }

    static boolean isAnagram3(String s, String t) {
        //Using inbuilt functions
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        //Sorting both the character arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }


    static boolean isAnagram2(String s, String t) {
        //Using HashTable
        Map<Character, Integer> count = new HashMap<>();
        //Incrementing the count of hashtable using s
        for(char x : s.toCharArray()){
            count.put(x, count.getOrDefault(x,0) + 1);
        }
        //Decrementing the count of hashtable using t
        for(char x : t.toCharArray()){
            count.put(x, count.getOrDefault(x,0) - 1);
        }
        //If the count values is non-zero return false.
        for(int val : count.values()){
            if(val!=0){
                return false;
            }
        }

        return true;
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
