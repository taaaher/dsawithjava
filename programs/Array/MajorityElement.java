package dsaWithJava.functions.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

    }

    static int MooresVotingAlgorithm(int[] nums){
        //Optimal Solution takes O(N)
        int length = nums.length;
        int count = 0;
        int element = 0;
        //Loop for getting the count of the array according to moores algorithm
        for (int i = 0; i < length; i++) {
            if (count==0){
                element=nums[i];
                count=1;
            } else if (nums[i]==element) {
                count++;
            }else {
                count--;
            }
        }

        //Loop for checking the availability of element which has occurred greater than n/2 times.
        int count2=0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == element){
                count2++;
            }
        }
        if (count2 > length/2){
            return element;
        }
        return -1;
    }

    static int majorityElement2(int[] nums){
        //Better Solution uses hash map for storing the values takes O(NlogN) time
        int length = nums.length;
        //Declaration of Hashmap.
        HashMap<Integer,Integer> mpp = new HashMap<>();
        //Loop for storing the values in hashmap as they occur
        for (int i = 0; i < length; i++) {
            int value = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],value+1);
        }

        //Loop for searching the element which has occurred more than n/2 times in the array.
        for (Map.Entry<Integer,Integer> it : mpp.entrySet()) {
            if (it.getValue() > length/2){
                return it.getKey();
            }
        }
        return -1;
    }
    static int majorityElement(int[] nums) {
        //Brute Force Approach takes O(N2).
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count>length/2){
                return nums[i];
            }
        }
        return -1;
    }

}
