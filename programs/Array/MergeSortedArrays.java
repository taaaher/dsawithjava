package dsaWithJava.functions.Array;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {0};
        int[] arr2 = {1};
        int m = 0;
        int n = 1;
//        merge(arr1,m,arr2,n);
        merge1(arr1,m,arr2,n);


    }

     static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;
         //loop till nums2 doesnt get places in nums1
         while (p2>=0){
             //if nums1 has elements and greater than nums2
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i--]=nums1[p1--];
            }else {
                nums1[i--]=nums2[p2--];
            }
        }
         System.out.println(Arrays.toString(nums1));


    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        //Brute force try but fails to pass test cases.
        int left = 0;
        int right = nums1.length-1;
        int length = m+n;
        if (n==0 && m>0){
            System.out.println(Arrays.toString(nums1));
            return;
        }
        while (left<n || right>0){
                if(nums1[right]<nums2[left]){
                    int temp = nums1[right];
                    nums1[right] = nums2[left];
                    nums2[left] = temp;
                    left++;
                    right--;
                    continue;
                }
                left++;
                right--;
            }
            Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }

}
