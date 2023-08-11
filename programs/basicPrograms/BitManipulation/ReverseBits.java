package dsaWithJava.functions.BitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 000101;
        int sol = reverseBits(n);
        System.out.println(sol);
    }

    static int reverseBits(int n) {
        int rev = 0;
        for(int i=0;i<32;i++){
            rev= rev<<1;
            rev = rev | (n&1);
            n=n>>1;

        }
        return  rev;
    }

}
