package dsaWithJava.functions;

public class Shadowing {
    static int x = 100; // This x will be shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x);  //Prints 100
        int x = 50;  // This x is overriding the global x initialized at 100
        System.out.println(x); //Prints 50
        fun(); //Prints 100
    }

     static void fun() {
         System.out.println(x);
    }
}
