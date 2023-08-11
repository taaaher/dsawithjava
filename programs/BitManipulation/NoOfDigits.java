package dsaWithJava.functions.BitManipulation;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10345;
        int b = 10;

        int digits = (int)(Math.log(n)/Math.log(b)) + 1;
        System.out.println(digits);
    }
}
