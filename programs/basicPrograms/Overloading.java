package dsaWithJava.functions;

public class Overloading {
    public static void main(String[] args) {
        fun(56);
        fun("Taher");
    }

    static void fun(int num){
        System.out.println(num);
    }

    static void fun(String name){
        System.out.print(name);
    }
}
