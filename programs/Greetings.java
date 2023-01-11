package dsaWithJava.firstProgram;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");

        String name = input.nextLine();
        String greeting = "Hello !";

        System.out.println(greeting + " " + name);

    }
}
