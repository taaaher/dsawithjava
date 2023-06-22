package dsaWithJava.functions.Array;

import java.util.HashMap;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    static int lengthOfLongestSubstring(String s) {
        int len = 0;
        int right = 0;
        int left = 0;
        int n = s.length();
        HashMap<Character,Integer> mpp = new HashMap<>();
        while(right<n){
            if (mpp.containsKey(s.charAt(right))){
                left = Math.max(mpp.get(s.charAt(right))+1,left);
            }
            mpp.put(s.charAt(right),right);
            len = Math.max(len, right-left+1);
            right++;
        }

        return len;
    }

}
