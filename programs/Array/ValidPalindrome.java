package dsaWithJava.functions.Array;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "Marge, let's \\\"[went].\\\" I await {news} telegram.";
        boolean ans = isPalindrome2(str);
        System.out.println(ans);
    }

    static boolean isPalindrome2(String s){
        //Using ascii values with two pointers
//        [0-9] -> [48-57]
//        [A-Z] -> [65-90]
//        [a-z] -> [97-122]

        int l = 0;
        int r = s.length()-1;
        while(l<r){
            char lIdx = s.charAt(l);
            char rIdx = s.charAt(r);

            if(!(lIdx>=48 && lIdx<=57 || lIdx>=65 && lIdx<=90 || lIdx>=97 && lIdx<=122)){
                l++;
                continue;
            }
            if(!(rIdx>=48 && rIdx<=57 || rIdx>=65 && rIdx<=90 || rIdx>=97 && rIdx<=122)){
                r--;
                continue;
            }
            if(lIdx>=65 && lIdx<=90){
                //converting uppercase to lowercase
                lIdx += 32;
            }
            if(rIdx>=65 && rIdx<=90){
                //converting uppercase to lowercase
                rIdx += 32;
            }
            if(lIdx!=rIdx){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static boolean isPalindrome(String s) {
        //Regex for removing non alpha-numeric values from the given string.
//        the first term is the valid values i.e lower and upper case alphabets and numerics from 0-9
//        and the second term is the replacement for values other than the regex.
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int st = 0;
        int ed = arr.length-1;
        while (st<=ed){
            if(arr[st]==' ' || arr[st]==','||arr[st]==':'||arr[st]=='.'){
                st++;
                continue;
            }
            if(arr[ed]==' ' || arr[ed]==','||arr[ed]==':'||arr[ed]=='.'){
                ed--;
                continue;
            }
            if(arr[st++] != arr[ed--]){
                return false;
            }
        }
        return true;
    }

}
