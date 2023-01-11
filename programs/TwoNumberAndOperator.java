package dsaWithJava.firstProgram;

import java.util.Scanner;
import java.util.SortedMap;

public class TwoNumberAndOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Enter an operator :");
        String operator = input.next();
        //Using equals method instead of the == to symbol.
        if(operator.equals("+")) {
            int sum = num1 + num2;
            System.out.println(sum);
        } else if (operator.equals("-")) {
            int sum = num1 - num2;
            System.out.println(sum);
        } else if (operator.equals("*")) {
            int sum = num1 * num2;
            System.out.println(sum);
        } else if(operator.equals("/")) {
            float sum = (num1) / (num2);
            System.out.println(sum);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
