package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] plusOne(int[] digits){
        List<Integer> ans = new ArrayList<>();
        int k = 1;
        int sum = 0;
        int carry = k;
        for (int i = digits.length-1; i >= 0; i--) {

            k = k/10;
            ans.add(0,sum);
        }

        if(carry>0){
            ans.add(0,carry);
        }
        int[] sol = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            sol[i] = ans.get(i);
        }

        return sol;
    }

}
