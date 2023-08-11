package dsaWithJava.functions.SlidingWindow;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean sol = checkInclusion(s1,s2);
        System.out.println(sol);
    }

    static boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
//        marking the character of first array.
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)-'a']++;
        }

        int l= 0;
        for (int r = 0; r < s2.length(); r++) {
            if (arr[s2.charAt(r)-'a'] > 0){
                arr[s2.charAt(r)-'a']--;
                if(l-r+1 == s1.length()){
                    return true;
                }
            }else {
                l=r+1;
            }
        }
        return false;
    }

}
