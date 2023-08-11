package dsaWithJava.functions.Array;

import java.util.Arrays;

public class SentenceIsPangram {
    public static void main(String[] args) {
        String sentence = new String("leetcode");
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);

    }


    static boolean checkIfPangram(String sentence) {
        for (char c = 'a';  c <= 'z' ; c++) {
            if(sentence.indexOf(c) < 0){
                return false;
            }
        }
        return true;
    }

}
