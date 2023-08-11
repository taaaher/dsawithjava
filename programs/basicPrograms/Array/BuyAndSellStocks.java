package dsaWithJava.functions.Array;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
//        int sol = maxProfit(arr);
        int sol = maxProfit1(arr);
        System.out.println(sol);
    }

     static int maxProfit1(int[] prices) {
        //Optimal solution O(N)
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min){
                min = prices[i];
            }
            max = Math.max(prices[i]-min,max);
        }
        return max;
    }

    static int maxProfit(int[] prices) {
        //Brute force Approach TC:O(N2)
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[i]<prices[j]){
                    max = Math.max(prices[j]-prices[i],max);
                }
            }
        }
        if(max>0){
            return max;
        }
        return 0;
    }

}
