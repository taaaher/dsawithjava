package dsaWithJava.functions.Recursion;

public class Fibonaci {
    public static void main(String[] args) {
        System.out.println(Fibo(7));
    }

    static int Fibo(int n){

//        Base condition
        if (n<2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }

}
