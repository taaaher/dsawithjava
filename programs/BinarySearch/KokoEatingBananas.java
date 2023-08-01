package dsaWithJava.functions.BinarySearch;

//https://leetcode.com/problems/koko-eating-bananas/
public class KokoEatingBananas {
    public static void main(String[] args) {
        int [] arr = {312884470};
        int sol = minEatingSpeed(arr, 312884469);
        System.out.println(sol);
    }

    static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1;
        int ans = 0;
//        Finding the maximum from the array
        for(int pile : piles){
            r = Math.max(r, pile);
        }

//        Our search will be between 1 to max element in the array.
        while(l<r){
            int hourCount = 0;
            int m = (l + r) / 2;

            for (int pile: piles){
                hourCount += (int) Math.ceil((double)pile/ m );
            }
//            reason for this condition ?
             if(hourCount <= h){
                 r = m;
             } else {
                 l = m+1;
             }
        }
        return r;
    }

}
