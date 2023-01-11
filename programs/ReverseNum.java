package dsaWithJava.conditionsAndLoops;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        reverse();
    }

    static void reverse(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to reverse : ");
        int num = in.nextInt();
        int rev = 0;
        int rem;
        int temp = num;
        while (num > 0){
            rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }
        System.out.println("Original : " + temp);
        System.out.print("Reverse : " + rev);

    }
}
