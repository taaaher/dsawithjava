package dsaWithJava.conditionsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //takes string input and trims it and stores the character at index 0.
        System.out.print("Enter a character : ");
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is" + " " + "Lower Case");
        }else {
            System.out.println(ch + " is" + " " + "Upper Case");
        }
    }
}
