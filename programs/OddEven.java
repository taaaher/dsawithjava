package dsaWithJava.firstProgram;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        oddEven();
    }
    static void oddEven(){
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num % 2) {
            case 0 -> System.out.println("Number is even");
            default -> System.out.println("Number is odd");
        }
    }
}
