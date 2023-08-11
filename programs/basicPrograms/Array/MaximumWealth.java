package dsaWithJava.functions.Array;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{3,2,1}};
       int ans =  maximumWealth(matrix);
        System.out.println(ans);
//        printAns(ans);
    }

    private static void printAns(int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }


    static int maximumWealth(int[][] accounts) {
        int length = accounts.length;
        int[] ans = new int[length];
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                ans[row] = ans[row] + accounts[row][col];
            }
        }

        int max = ans[0];
        for (int i = 0; i < ans.length-1; i++) {
            if(max < ans[i]){
                max = ans[i];
            }
        }
        return max;
    }
}
