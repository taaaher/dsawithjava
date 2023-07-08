package dsaWithJava.functions.Array;
//https://leetcode.com/problems/valid-sudoku/description/

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] game =   {{'5','3','.','.','7','.','.','.','.'}
                            ,{'6','.','.','1','9','5','.','.','.'}
                            ,{'.','9','8','.','.','.','.','6','.'}
                            ,{'8','.','.','.','6','.','.','.','3'}
                            ,{'4','.','.','8','.','3','.','.','1'}
                            ,{'7','.','.','.','2','.','.','.','6'}
                            ,{'.','6','.','.','.','.','2','8','.'}
                            ,{'.','.','.','4','1','9','.','.','5'}
                            ,{'.','.','.','.','8','.','.','7','9'}};
        boolean ans = isValidSudoku(game);
        System.out.println(ans);
        }

    static boolean isValidSudoku(char[][] board) {
        //Solution without using hashset
        boolean ans = true;
        //Search for the element in the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               char inspect =  board[i][j];
                if(inspect == '.'){
                    continue;
                }else {
                   boolean r =  searchRow(inspect, board,i,i);
                   boolean c =  searchCol(inspect, board,i,j);
                   boolean m =  searchBox(inspect,board,i,j);
                    if(r==true||c==true||m==true){
                        return false;
                    }
                }

            }
        }
        //If number is present then 3 search required
        return ans;
    }

        //Search in the corresponding 3*3 matrix.
    private static boolean searchBox(char inspect, char[][] board, int row, int col) {
        int rowStart = row-row%3;
        int colStart = col-col%3;
        int count = 0;
        for (int i = rowStart; i < rowStart+3; i++) {
            for (int j = colStart; j < colStart+3; j++) {
                if(board[i][j] == inspect){
                    count++;
                }
            }
        }
        if (count>1){
            return true;
        }
        return false;
    }

        //Search in the corresponding col.
    private static boolean searchCol(char inspect, char[][] board,int row, int col) {
        int count = 0;
        for (int i = 0; i < board[0].length; i++) {
            if(board[i][col] == inspect){
                count++;
            }
            if (count>1){
                return true;
            }
        }
        return false;
    }

        //Search in the corresponding row.
    private static boolean searchRow(char inspect, char[][] board, int row, int col) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == inspect){
                count++;
            }
            if(count>1){
                return true;
            }
        }
        return false;
    }

}
