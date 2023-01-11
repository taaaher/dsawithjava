package dsaWithJava.conditionsAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
        //Implementation using if conditions.
//        if (b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

        // using math class for finding maximum among given numbers.
        int max = Math.max(c,Math.max(a,b));

        System.out.println(max);
    }
}
