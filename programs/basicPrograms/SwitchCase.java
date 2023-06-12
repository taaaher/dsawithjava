package dsaWithJava.switchStaements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "Apple" -> System.out.println("A red fruit");
//            case "Mango" -> System.out.println("king of fruits");
//            case "Guava" -> System.out.println("A green fruit");
//            case "Orange" -> System.out.println("A juicy fruit");
//            default -> System.out.println("Enter a valid fruit");
//        }

//        int month = in.nextInt();
//        switch (month){
//            case 1 -> System.out.println("January");
//            case 2 -> System.out.println("Feburary");
//            case 3 -> System.out.println("March");
//            case 4 -> System.out.println("April");
//            case 5 -> System.out.println("May");
//            case 6 -> System.out.println("June");
//            case 7 -> System.out.println("July");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("September");
//            case 10 -> System.out.println("October");
//            case 11 -> System.out.println("November");
//            case 12 -> System.out.println("December");
//            default -> System.out.println("Enter a valid number");
//        }


        int day = in.nextInt();
        //Enhanced switch statements click on switch and press alt+enter for suggestion.
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid day number");
        }


    }
}
