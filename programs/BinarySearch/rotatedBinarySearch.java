package BinarySearch;
//Rotated Binary Search
public class rotatedBinarySearch {
    public static void main(String[] args) {
    int arr[] = {3, 5, 1};
        System.out.println(search(arr, 3));

    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if you did not find a pivot i.e the array is not rotated.
        if(pivot == -1){
            // just do normal binary search.
            return binarySearch(nums, target, 0, nums.length-1);
        }

        // if you found pivot i.e we have 2 asc arrays.
        // case 1 : if target == pivot element.
        if(nums[pivot] == target){
            return pivot;
        }

        // Case 2: if target > start element.
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        // Case 3: if target < start element.
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){

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

    static int findPivotWithDuplicates(int[] arr){
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
            //if elements at start, mid and end are equal then skip the duplicates
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //skip the duplicates
                if(arr[start] > arr[start+1]){
                    return  start;
                }
                start++;

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
