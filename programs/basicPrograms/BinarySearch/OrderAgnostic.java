package dsaWithJava.functions.BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {

        int[] num = {903, 839, 738, 647, 574, 475, 390, 209, 109, 90, 30, 0};
        int target = 475;
        int ans = orderAgnosticBS(num, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0 ;
        int end = arr.length - 1;

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
