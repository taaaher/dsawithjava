package dsaWithJava.functions.BitManipulation;

//https://leetcode.com/problems/sum-of-two-integers/

public class SumTwoIntegers {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int sol = getSum(a,b);
        System.out.println(sol);
    }

    static int getSum(int a, int b) {
        while(b != 0){
            int carry = (a&b)<<1;
            a = a^b;
            b = carry;
        }
        return a;
    }
}
