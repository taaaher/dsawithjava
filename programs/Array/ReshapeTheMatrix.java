package dsaWithJava.functions.Array;

import java.util.Arrays;

//https://leetcode.com/problems/reshape-the-matrix/description/
public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2}};
        int r = 1;
        int c = 1;
        int [][] ans = matrixReshape(arr,r,c);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] transformed = new int[r][c];
        int m_max = mat.length;
        int n_max = mat[0].length;
        int m = 0;
        int n = 0;
        //If the dimension differ then it we will return the mat because we don't want illegal enteries.
        if(r*c != m_max*n_max){
            return mat;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(n == n_max){
                    n = 0;
                    m++;
                }
                if(m == m_max){
                    break;
                }
                transformed[i][j] = mat[m][n];
                n++;
            }
        }
        return transformed;
    }

}
