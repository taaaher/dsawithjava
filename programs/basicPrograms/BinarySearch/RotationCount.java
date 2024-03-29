package dsaWithJava.functions.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int nums[] = {3,5,1};
        int pivot = findPivot(nums);
        int count =  pivot +1;
        System.out.println(count);
    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        // 4 Cases
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
