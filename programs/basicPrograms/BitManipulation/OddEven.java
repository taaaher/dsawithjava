package dsaWithJava.functions.BitManipulation;

public class OddEven {
    public static void main(String[] args) {
        int n = 472;
        System.out.println(isEven(n));
    }

    private static boolean isEven(int num){
        return (num & 1) == 0;
    }
}
