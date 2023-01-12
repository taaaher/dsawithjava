package dsaWithJava.switchStaements;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rollno = in.nextInt();
        String Department = in.next();

        switch (rollno) {
            case 1 -> System.out.println("Taher Ali");
            case 2 -> System.out.println("Nevil Dsouza");
            case 3 -> System.out.println("Jiten Sutar");
            case 4 -> {
                System.out.println("Department Names");
                switch (Department) {
                    case "SWE" -> System.out.println("Software Engineering");
                    case "IT" -> System.out.println("Information Technology");
                    case "DSC" -> System.out.println("Data Science");
                    case "AI" -> System.out.println("Artificial Intelligence");
                    default -> System.out.println("Enter a valid department");
                }
            }
            default -> System.out.println("Enter a valid roll no");
        }

    }
}
