package dsaWithJava.functions.BitManipulation;

public class Power {
    public static void main(String[] args) {
        int n = 4;
        int pow = 6;
        int ans = 1;
        int base = n;

        while (pow>0){
//            if the lsb is 1 then update the answer else continue
            if((pow&1) == 1){
                ans *= base;
            }
//            update the base for each loop and right shift the number.
            base *= base;
            pow=pow>>1;
        }
        System.out.println(ans);
    }
}
