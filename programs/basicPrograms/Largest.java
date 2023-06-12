package dsaWithJava.conditionsAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        max();
//        int max = a;
        //Implementation using if conditions.
//        if (b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
        // using math class for finding maximum among given numbers.
    }
    static void max(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = Math.max(c,Math.max(a,b));

        System.out.println(max);
    }
}
