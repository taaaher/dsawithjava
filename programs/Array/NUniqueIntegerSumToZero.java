package dsaWithJava.functions.Array;

import java.util.Arrays;
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

public class NUniqueIntegerSumToZero {
    public static void main(String[] args) {
        int n = 2;
        int[] ans = sumZero(n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sumZero(int n) {
        int[] ans = new int[n];
        int counter = 2;
        if(n%2 == 1){
            //This works for odd number of digits.
            for (int i = 0; i < n; i++) {

                if (i == n/2){
                    ans[i] = 0;
                } else if (i < n/2) {
                    ans[i] = -1*(n-i);
                }else {
                    ans[i] = n-i + counter;
                    counter = counter + 2;
                }
            }
        }else {
             counter = 1;
            for (int i = 0; i < n; i++) {
                if(i < n/2){
                    ans[i] = -1*(n-i);
                }else {
                    ans[i] = n-i + counter;
                    counter = counter +2;
                }
            }
        }

        return ans;
    }

}
