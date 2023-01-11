package dsaWithJava.conditionsAndLoops;

import java.util.Scanner;

public class OcurrenceOfNumber {
    public static void main(String[] args) {
        //Counts the number of time a number occurs in the sequence entered
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers : ");
        int seq = in.nextInt();
        System.out.print("enter the number to check frequency : ");
        int n = in.nextInt();
        int count = 0;

        while(seq > 0) {
            if (seq % 10 == n){
                count++;
            }
            seq = seq/10;
        }

        System.out.print("The frequency of" + " " + n + " is" + " " + count);
    }
}
