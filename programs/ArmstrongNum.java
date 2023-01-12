package dsaWithJava.functions;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        for (int i = 0; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int z){
        int original = z;
        int sum = 0;
        int rem;

        while(z>0){
            rem = z % 10;
            z= z / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
