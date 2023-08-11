package dsaWithJava.functions.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,5,14,56,78,456,3456};
        System.out.println(search(nums,78,0, nums.length-1));
    }

    static int search(int[] arr, int target,int start, int end){

        int mid = start+(end-start)/2;
        //Base condition
        if(start>end){
            //Returning the answer
            return -1;
        }
        if(arr[mid] == target){
            //Returning the answer
            return mid;
        }
        if (arr[mid]>target){
            //Sub recursion called hence returned.
            return search(arr,target,start,mid-1);
        }else {
            //sub recursion called hence returned.
            return search(arr,target,mid+1,end);
        }

    }

}
