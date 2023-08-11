package dsaWithJava.functions.BitManipulation;

//https://leetcode.com/problems/number-of-1-bits/
public class NumberOfOneBits {
    public static void main(String[] args) {
        int n = 1111111;
        int sol = hammingWeight(n);
        System.out.println(sol);
    }

    static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
