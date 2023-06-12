package dsaWithJava.functions.Array;

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class CellsWithOddValueInMatrix {
    public static void main(String[] args) {
        int m = 48;
        int n = 37;
        int[][] indices = {{40,5}};
        int ans = oddCells(m,n,indices);
        System.out.println(ans);
    }

    static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] arr = new int[m][n];


        for (int i = 0; i < indices.length; i++) {
            //keeping the row constant for increment in matrix while changing the column.
            for (int j = 0; j < n; j++) {
                arr[indices[i][0]][j]++;
            }
            //keeping the col constant and changing the row.
            for (int j = 0; j < m; j++) {
                arr[j][indices[i][1]]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]%2==1){
                    count++;
                }
            }
        }

        return count;
    }

}
