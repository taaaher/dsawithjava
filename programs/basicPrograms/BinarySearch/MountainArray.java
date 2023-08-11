package dsaWithJava.functions.BinarySearch;

public class MountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start > end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] > arr[mid+1]){
                //we are in decreasing part this may be the answer but look in the left
                end = mid;
            } else {
                 //we are in asc part of array.
                start = mid + 1; // because we know that here mid+1 is greater than mid.
            }
            //In the end start == end both pointing to the largest number.

        }
        return start;
    }
}
