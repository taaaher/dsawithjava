package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {

    }

    static List<Integer> majorityElement(int[] nums) {
        //Better Solution takes O(NlogN) time
        int length = nums.length;
        HashMap<Integer,Integer> hshmp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < length; i++) {
           int value = hshmp.getOrDefault(nums[i],0);
            hshmp.put(nums[i],value+1);
        }

        for (Map.Entry<Integer,Integer> it: hshmp.entrySet()) {
            if (it.getValue() > length/3){
                ans.add(it.getKey());
            }
        }
        return ans;
    }

}
