package dsaWithJava.functions.Array;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        int[] sol = topKFrequent(arr, k);
        System.out.println(Arrays.toString(sol));
    }

    static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer,Integer> mp = new HashMap<>();
        //iterate over the array to get the frequency of the elements.
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        //Making a priority queue where key value will be stored.
            PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                    //custom comparator to store values in ascending order of frequencies
                    (a,b) -> a.getValue() - b.getValue()
            );
        // Iterating over the map and adding pairs to priority queue if the size exceeds k remove the first pair.
            for(Map.Entry<Integer,Integer> it : mp.entrySet()){
                pq.add(it);
                if (pq.size() > k){
                    //Removes the first pair from the priority queue.
                    pq.poll();
                }
            }
            int i = k;
            //Placing values in the array from the last index.
            while(!pq.isEmpty()){
                ans[--i] = pq.poll().getKey();
            }

        return ans;
    }
}
