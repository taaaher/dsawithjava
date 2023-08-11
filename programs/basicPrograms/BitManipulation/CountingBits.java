package dsaWithJava.functions.BitManipulation;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int[] sol = countBits(n);
        System.out.println(Arrays.toString(sol));
    }

    static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int num = 0; num <= n; num++) {
            ans[num] = setBits(num);
        }
        return ans;
    }

    static int setBits(int n){
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
