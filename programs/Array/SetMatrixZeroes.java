package dsaWithJava.functions.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/set-matrix-zeroes/

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] mat = {{-1,1,1},{1,0,1},{1,1,-1}};
//        setZeroes(mat);
//        setZerosBetter(mat);
        setZerosOptimal(mat);
    }

    private static void setZerosOptimal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if (j!=0){
                        matrix[0][j] = 0;
                    }else {
                        col0 = 0;
                    }
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0){
            for (int i = 1; i < n; i++) {
                matrix[0][i]=0;
            }
        }
        if(col0==0){
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    static void setZerosBetter(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 if (mat[i][j] == 0){
                     row[i] = 1;
                     col[j] = 1;
                 }
             }
         }

         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 if (row[i]==1 || col[j]==1){
                     mat[i][j] = 0;
                 }
             }
         }

         System.out.println(Arrays.deepToString(mat));
    }

    static void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int mark = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                 markRow(matrix,i,n);
                 markCol(matrix,j,m);
                 mark = 1;
                }
            }
        }
        if(mark == 1){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j]==-1){
                        matrix[i][j] = 0;
                    }
                }
            }
        }


        System.out.println(Arrays.deepToString(matrix));
    }

    public static void markRow(int[][] arr,int i, int col) {
        for (int j = 0; j < col; j++) {
            if (arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }

    private static void markCol(int[][] arr,int j, int row) {
        for (int i = 0; i < row; i++) {
            if (arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }


}
