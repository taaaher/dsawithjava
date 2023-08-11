package dsaWithJava.functions.Array;

public class UniquePaths {
    public static void main(String[] args) {
        int sol = uniquePaths1(10,10);

        System.out.println(sol);
    }

    static int uniquePaths1(int m, int n) {
        //Optimal approach using combinatorics
        int total = m-1+n-1;
        int r = m-1;
        int c = n-1;
        double ans = 1;
        for (int i = 1; i <= r; i++) {
            //imagine as 8c3 can be written as 8*7*6/1*2*3.
            ans = ans*(total-r+i)/i;
        }
        return (int)ans;
    }
    static int uniquePaths(int m, int n) {
        //Brute force approach takes very high time complexity
        int total = m-1+n-1;
        int r = m-1;
        int c = n-1;
        int ans = fac(total)/(fac(r)*fac(c));
        return ans;
    }

    private static int fac(int num) {
        int ans = 1;
        int n = num;
        for (int i = num; i >0; i--) {
            ans = ans*i;
        }
        return ans;
    }

}
