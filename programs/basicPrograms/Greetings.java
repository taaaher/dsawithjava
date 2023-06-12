package dsaWithJava.firstProgram;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        String greet = greeting(name);
        System.out.println(greet);
    }

    static String greeting(String name){

        String greeting = "Hello " + name;
        return greeting;
    }
}
