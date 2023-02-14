package BinarySearch;

import java.util.Scanner;

public class CeilingNumber {
    public static void main(String[] args) {

        // Q find the ceiling of the given number.

        Scanner in = new Scanner(System.in);
//        System.out.println("Enter elements in array : ");
       // Take input of array from the users.

        int[] arr = {1, 2, 3, 4, 5, 8, 9, 11, 13, 15, 16, 19, 20, 23, 25, 28, 30, 35, 37};
        System.out.print("Enter number to get the ceiling  and floor value : ");
        int num = in.nextInt();

        int ans = ceiling(arr, num);
        System.out.println("The ceiling value is : "+ arr[ans]);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        if(target > arr[arr.length-1]){
            return -1;
        }

        while(start <= end){
            // find the mid.
            int mid = start + ((end - start) / 2);

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
