package dsaWithJava.functions.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

//        integer will convert to Integer and call toString method()
//        This is equivalent to "a" + "1".
        System.out.println("a" + 1);

        System.out.println("Taher" + new ArrayList<>());
        System.out.println("Taher" + new Integer(89));

//      The + operator is defined for primitives and string data type.
//        If i remove the string from below it will throw and error

        String ans = new ArrayList<>() + "" + new Integer(89);
        System.out.println((ans));
    }
}
