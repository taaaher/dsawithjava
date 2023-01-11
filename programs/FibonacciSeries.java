package dsaWithJava.firstProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for the fibonacci series : ");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;
        System.out.println(first);
        System.out.println(second);
        for(int i = 0; i<n; i++){
            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
        }
        System.out.println("Sequence ended");

    }
}
