package dsaWithJava.functions.Array;

import java.util.Arrays;

public class SpiralMatrixGenerator {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(3);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int row = n-1;
        int col = n-1;
        int left = 0, top = 0;
        int right = col, bottom = row;
        int counter = 1;
        while(left<=right && top<=bottom){
            //right traversal
            for (int i = left; i <= right ; i++) {
                mat[top][i] = counter;
                counter++;
            }
            top++;
            //Bottom Traversal
            for (int i = top ; i <= bottom ; i++) {
                mat[i][right] = counter;
                counter++;
            }
            right--;
            //Left Traversal
            if(top<=bottom){
                for (int i = right; i >= left ; i--) {
                    mat[bottom][i] = counter;
                    counter++;
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >= top ; i--) {
                    mat[i][left] = counter;
                    counter++;
                }
                left++;
            }

        }
        return  mat;
    }

}
