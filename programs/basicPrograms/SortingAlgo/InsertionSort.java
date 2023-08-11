package dsaWithJava.functions.SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insetion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insetion(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] > arr[j-1]){
                    break;
                }
                swap(arr, j, j-1);
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
