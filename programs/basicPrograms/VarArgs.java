package dsaWithJava.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

//        fun(2, 3, 45, 23, 90, 45, 345);
        run("Taher", "Nevil", "new", "Learning");
        run(1, 34, 45, 90, 456);
    }

    static void fun(int...z){
        System.out.println(Arrays.toString(z));
    }

    static void run(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void run(String...v){
        System.out.println(Arrays.toString(v));
    }
}
