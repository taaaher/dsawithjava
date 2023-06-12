package dsaWithJava.firstProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Fibo();
    }

    static void Fibo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term for the fibonacci series : ");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;
//        System.out.println(first);
//        System.out.println(second);
        // Code for printing the fibbonaci series.
//        for(int i = 0; i<n; i++){
//            sum = first + second;
//            System.out.println(sum);
//            first = second;
//            second = sum;
//        }
//        System.out.println("Sequence ended");


        // Find the nth number in the Fibonacci Series
        if (n == 0){
            sum = first;
        }
        if (n == 1){
            sum = second;
        }

        for (int i = 0; i < n-1; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println("The nth term in the sequence is" + " " + sum);
    }
}

