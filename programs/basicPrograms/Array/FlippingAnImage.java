package dsaWithJava.functions.Array;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/description/
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] flipped = flipAndInvertImage(matrix);
        //deepToString is used for printing 2d array i.e matrix.
        System.out.println(Arrays.deepToString(flipped));

    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {

                int start = 0;
                int end = image[row].length-1;
                while(start < end){
                    swap(image[row], start, end);
                    start++;
                    end--;
                }

        }
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                if(image[row][col] == 0){
                    image[row][col] = 1;
                }else {
                    image[row][col] = 0;
                }
            }
        }
        return image;
    }

     static void swap(int[] image, int first, int second) {
        int temp = image[first];
        image[first] = image[second];
        image[second] = temp;
    }
}
