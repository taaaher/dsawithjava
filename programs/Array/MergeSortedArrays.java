package dsaWithJava.functions.Array;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(arr1,m,arr2,n);

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = 0;
        int i = 0;
        int length = m+n;
        if (n==0){
            System.out.println(Arrays.toString(nums1));
            return;
        }
            while (i<length){
                if (nums1[i] == 0){
                    nums1[i]=nums2[counter];
                    counter++;
                } else if (nums1[i]<nums2[counter]) {
                    i++;
                }else {
                    int temp = nums1[i];
                    nums1[i] = nums2[counter];
                    nums2[counter] = temp;
                }
                i++;
            }

        System.out.println(Arrays.toString(nums1));
    }

}
