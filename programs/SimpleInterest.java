package dsaWithJava.firstProgram;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principal : ");
        int principal = input.nextInt();

        System.out.println("Enter Time : ");
        int time = input.nextInt();

        System.out.println("Enter Rate : ");
        float rate = input.nextFloat();

        float SI = (principal*rate*time)/100;

        System.out.println("Your simple interest is :" + " " + SI);
    }
}
