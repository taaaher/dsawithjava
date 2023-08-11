package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{3,6},{7,1},{5,2},{4,8}};
        List<Integer> sol = new ArrayList<>();
        sol = luckyNumbers(arr);
        System.out.println(sol);
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        int col = 0;
        List<Integer> ans = new ArrayList<>();
        int sol = -1;
        //
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int max = matrix[i][col];
            //for finding min in the row.
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    col = j;
                    max = matrix[i][j];
                }
            }
            //for finding max in the column
            for (int k = 0; k < matrix.length; k++) {

                if(matrix[k][col] > max){
                    max = matrix[k][col];
                }
            }
            if(min == max){
                sol = max;
            }

        }
        //Enter the element in list only if there exists a lucky number.
        if(sol>0){
            ans.add(sol);
        }

        return ans;
    }

}
