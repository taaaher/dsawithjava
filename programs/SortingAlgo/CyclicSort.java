package SortingAlgo;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums= {5, 4, 3, 2, 1};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void cyclicSort(int[] arr){
        // check
       int i = 0;
            while(i < arr.length){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else {
                    i++;
                }
            }
        // swap
        // move
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
