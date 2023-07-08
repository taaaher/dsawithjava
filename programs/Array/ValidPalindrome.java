package dsaWithJava.functions.Array;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "a.@#$%";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
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
