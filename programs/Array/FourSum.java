package dsaWithJava.functions.Array;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = fourSum2(arr,0);
        System.out.println(ans);
    }

    static List<List<Integer>> fourSum2(int[] nums, int target){
        //Optimal Solution O(n3)
        //Set which will contain all the arrays of 4 sum pair
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                //Set which will keep track of the elements in the kth loop
                Set<Long> hashset = new HashSet<>();
                for (int k = j+1; k < nums.length; k++) {
                    long sum = nums[i]+nums[j];
                    sum = sum + nums[k];
                    long fourth = target-(sum);
                    if (hashset.contains(fourth)){
                        //List for keeping track of the 4 sum values.
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    //If fourth not in the list add nums[k] to the hashset.
                    hashset.add((long) nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        //Brute Force Approach O(n4)
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    for (int l = k+1; l < nums.length; l++) {
                        long sum = nums[i]+nums[j];
                        sum = sum+nums[k];
                        sum = sum+nums[l];
                        if (sum == target){
                            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        ans = new ArrayList(set);
        return ans;
    }

}
