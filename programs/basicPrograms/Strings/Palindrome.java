package dsaWithJava.functions.Strings;

public class Palindrome {
    public static void main(String[] args) {
    String word = "";
        System.out.println(isPalindrome(word));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
