package dsaWithJava.functions.Array;

public class Pow_x_n {
    public static void main(String[] args) {
        double sol = myPow(2.0000,10);
        System.out.println(sol);
    }



    static double myPow(double x, int n) {
        //Striver's Approach.
        double ans = 1.0;
        long nn = n;
        if(nn<0){
            nn=nn*-1;
        }
        while (nn>0){
            //Double the value of x if it's even and half the value of n
            if (nn%2==0){
                nn=nn/2;
                x=x*x;
            }else {
                //If nn is odd subtract 1 from power and multiply x with the answer.
                ans=ans*x;
                nn=nn-1;
            }
        }
        if (n<0){
            ans = (double) 1.0/(double) ans;
        }
        return ans;


        //Intitial Solution
        //On the online judge this solution is leading to Time Limit Exceeded error
//        double ans = 1;
//        if (n>0){
//            for (int i = 0; i < n; i++) {
//                ans = ans*x;
//            }
//        }else {
//            for (int i = n; i < 0; i++) {
//                ans = ans/x;
//            }
//        }
//        return ans;
    }

}
