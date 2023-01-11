package dsaWithJava.firstProgram;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in rupees : ");
        float rupees = input.nextFloat();
        float usd = (rupees/82.35f);
        System.out.println("Amount in Usd :" + " " + usd);
    }
}
