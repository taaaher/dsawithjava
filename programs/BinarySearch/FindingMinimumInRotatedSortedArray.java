package dsaWithJava.functions.BinarySearch;

public class FindingMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {5,1,2,3,4};
        int sol = findMin(arr);
        System.out.println(sol);
    }

    static int findMin(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;

        while (l < r){
            int m = (l+r)/2;
             if(nums[m] > nums[r]){
                 l = m+1;
             }else {
                 r = m;
             }
            }
        return nums[r];
    }
}


