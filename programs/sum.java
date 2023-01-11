package dsaWithJava;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();

        int ans = sum3(45, 234);
        System.out.println(ans);

    }

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers :");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        return (int) sum;
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers :");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum is :" + " " + sum);
    }
}
