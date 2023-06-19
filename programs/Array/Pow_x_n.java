package dsaWithJava.functions.Array;

public class Pow_x_n {
    public static void main(String[] args) {
        double sol = myPow(2.0000,-2147483648);
        System.out.println(sol);
    }


    //On the online judge this solution is leading to Time Limit Exceeded error
    static double myPow(double x, int n) {
        double ans = 1;
        if (n>0){
            for (int i = 0; i < n; i++) {
                ans = ans*x;
            }
        }else {
            for (int i = n; i < 0; i++) {
                ans = ans/x;
            }
        }
        return ans;
    }

}
