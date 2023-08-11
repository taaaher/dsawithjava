package dsaWithJava.functions.BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 23;

        if(n==0){
            System.out.println("Not a power of 2");
        } else if( (n & (n-1)) == 0 ){
            System.out.println("Power of 2");
        }else {
            System.out.println("Not a power of 2");
        }

    }
}
