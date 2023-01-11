package dsaWithJava.conditionsAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        prints first n numbers
//        for (int num = 0; num < n; num++) {
//            System.out.print(num + " ");

        // While loop
        int num = 0;
//        while (num < n) {
//            System.out.print(num + " ");
//            num++;
//        }

        //Do-While loop
        do {
            System.out.print(num + " ");
            num++;
        }while(num < n);

    }
}
