package dsaWithJava.functions.SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int sol = characterReplacement(s, 1);
        System.out.println(sol);
    }

    static int characterReplacement(String s, int k) {

        int ans = 0;
        int max = 0;
        int l = 0;
        int[] arr = new int[26];

        for (int r = 0; r < s.length(); r++) {
//            getting the count of characters.
            arr[s.charAt(r)-'A']++;
//            keep counts of the max occurence of the character.
            max = Math.max(max, arr[s.charAt(r)-'A']);
//            if the window size is greater than the possible we will decrease decerase the window.
            if((r-l+1) - max > k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }

}
