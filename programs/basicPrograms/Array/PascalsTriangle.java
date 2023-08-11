package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/description/

public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> ans = generate(rows);
        System.out.println(Arrays.toString(List.of(ans).toArray()));

    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        //Loop for generating each row elements.
        for (int row = 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    private static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        //Loop for generating elements from 2nd index to last.
        for (int col = 1; col < row; col++) {
            ans = ans*(row-col);
            ans = ans/col;
            ansRow.add((int)ans);
        }
        return  ansRow;
    }


}
