package dsaWithJava.functions.BitManipulation;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 31;
        int n2 = n;
        int count = 0;
        int count2 = 0;

//        mehtod 1
        while(n>0){
            if( (n&1) == 1){
                count++;
            }
            n = n>>1;
        }

        System.out.println(count);

//        Method 2
        while (n2>0){
            n2 = n2&(n2-1);
            count2++;
        }
        System.out.println("Answer with method 2 : "  + count2);

    }
}
