package dsaWithJava.functions.Array;

import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/description/
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] ans = transpose(matrix);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        //create a new array of dimension col*row and put the values of i,j into j,i position.
        int[][] transposed = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        
        return transposed;
    }


}
