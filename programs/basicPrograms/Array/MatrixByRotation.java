package dsaWithJava.functions.Array;

public class MatrixByRotation {
    public static void main(String[] args) {
        int[][] arr = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        boolean ans = findRotation(arr,target);
        System.out.println(ans);
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if(isEqual(mat,target)){
                return true;
            }
           mat = rotate(mat);
        }
        return false;
    }

     static boolean isEqual(int[][] mat, int[][] target) {
        int mat_r = mat.length;
        int mat_c = mat[0].length;
        int target_r = target.length;
        int target_c = target[0].length;
        if(mat_r != target_r){
            return false;
        }
        if (mat_c != target_c){
            return false;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    static int[][] rotate(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[row][col];

        //finding transpose of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                ans[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // for interchanging the first and last column till the mid
        for (int i = 0; i < matrix.length; i++) {
            for (int col_1 = 0, col_2=matrix[0].length-1; col_1 < col/2; col_1++, col_2--) {
                int temp = ans[i][col_1];
                ans[i][col_1] = ans[i][col_2];
                ans[i][col_2] = temp;
            }
        }

        return ans;
    }
}
