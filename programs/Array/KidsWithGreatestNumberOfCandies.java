package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extra = 10;
        List<Boolean> ans = kidsWithCandies(candies, extra);
        System.out.println(ans);

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        //Loop for getting the maximun of the array.
        for (int i = 0; i < length; i++) {
            if(max < candies[i]){
                max = candies[i];
            }
        }

        for (int i = 0; i < length; i++) {
            if(candies[i] + extraCandies >= max){
                ans.add(Boolean.TRUE);
            }else {
                ans.add(Boolean.FALSE);
            }
        }
        return ans;
    }
}

