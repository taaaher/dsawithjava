package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
    int[] num = {2, 3, 4, 6, 9, 10, 11, 12, 14, 20, 36, 58};
    int target = 12;
    int ans = binarySearch(num, target);
        System.out.println(ans);

    }

    //return index
    //if element not present return -1
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //find the middle element
//            int mid = (start + end)/2; this mid can be out of range for larger values
            //better way to find mid this will never lead to out of range for int.
            int mid = start + (end-start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                //ans is middle.
                return mid;
            }


        }
        return -1;
    }
}
