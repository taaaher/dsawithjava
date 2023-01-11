package dsaWithJava.firstProgram;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.print(num1 + " is greater than " + num2);
        }else {
            System.out.print(num2 + " is greater than " + num1);
        }
    }
}
