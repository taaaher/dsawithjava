package dsaWithJava.functions.BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target,peak+1,arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start > end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] > arr[mid+1]){
                //we are decresing part this may be the answer but look in the left
                end = mid;
            } else {
                //we are in asc part of array.
                start = mid + 1; // because we know that here mid+1 is greater than mid.
            }
            //In the end start == end both pointing to the largest number.

        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){


        //find the array in ascending or descending.
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find the middle element
//            int mid = (start + end)/2; this mid can be out of range for larger values
            //better way to find mid this will never lead to out of range for int.
            int mid = start + (end-start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            //checking the order of array
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
