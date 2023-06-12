package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/description/

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = spiralOrder(arr);
        System.out.println(Arrays.toString(ans.toArray()));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sol = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, top = 0;
        int right = n-1, bottom = m-1;

        while(left<=right && top<=bottom){
            //right traversal
            for (int i = left; i <= right ; i++) {
                sol.add(matrix[top][i]);
            }
            top++;
            //Bottom Traversal
            for (int i = top ; i <= bottom ; i++) {
                sol.add(matrix[i][right]);
            }
            right--;
            //Left Traversal
            if(top<=bottom){
                for (int i = right; i >= left ; i--) {
                    sol.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >= top ; i--) {
                    sol.add(matrix[i][left]);
                }
                left++;
            }

        }

        return sol;
    }

}
