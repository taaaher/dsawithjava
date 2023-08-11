package dsaWithJava.functions.Array;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-image/description/
public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,4,5},{4,5,2}};
    }

    static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int counter = 0;
        // Transpose the matrix
        for (int i = 0; i < row; i++) {
            for (int j = counter++; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int start = 0;
        int end = col-1;
        //interchanging the columns till mid.
        while(start<=end){
            for (int i = 0; i < row; i++) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
            }
            start++;
            end--;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}


