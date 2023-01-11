package dsaWithJava.firstProgram;

import java.util.Scanner;
import java.util.SortedMap;

public class TwoNumberAndOperator {
    public static void main(String[] args) {
        operate();
    }

    static void operate(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Enter an operator :");
        String operator = input.next();
        //Using equals method instead of the == to symbol.
        switch (operator) {
            case "+" -> {
                int sum = num1 + num2;
                System.out.println(sum);
            }
            case "-" -> {
                int sum = num1 - num2;
                System.out.println(sum);
            }
            case "*" -> {
                int sum = num1 * num2;
                System.out.println(sum);
            }
            case "/" -> {
                float sum = (num1) / (num2);
                System.out.println(sum);
            }
            default -> System.out.println("Invalid operator");
        }
    }
}
