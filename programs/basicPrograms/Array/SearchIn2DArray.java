package dsaWithJava.functions.Array;

import static java.util.Arrays.binarySearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean ans ;
        ans = searchMatrix(mat,13);
        System.out.println(ans);

    }

    static boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        for (int i = 0; i < matrix.length; i++) {
            int first = matrix[i][0];
            int last = matrix[i][col];
            if(target >= first && target <= last){
                int sol = binrysearch(matrix,i,0,col,target);
                if(sol==target){
                    ans = true;
                }
            }
        }


        return ans;
    }

    static int binrysearch(int[][] matrix,int row, int colStart, int colEnd, int target) {
        while (colStart<= colEnd){
            if (matrix[row][colEnd]==target){
                return matrix[row][colEnd];
            }
            int mid = (colStart+colEnd)/2;
            if(matrix[row][mid] == target){
                return matrix[row][mid];
            }if (matrix[row][mid] < target){
                colStart = mid+1;
            }else {
                colEnd = mid-1;
            }
        }
        return -1;
    }
}
