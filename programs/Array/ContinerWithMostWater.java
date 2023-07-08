package dsaWithJava.functions.Array;

//https://leetcode.com/problems/container-with-most-water/description/
public class ContinerWithMostWater {
    public static void main(String[] args) {
        int[] arr ={1,8,6,2,5,4,8,3,7};
        int sol = maxArea2(arr);
        System.out.println(sol);
    }

    static int maxArea2(int[] height) {
//        Two pointer approach
        int res = 0;
        int l = 0;
        int r = height.length-1;
        while (l<r){
            int ans = Math.min(height[l],height[r])*(r-l);
            res = Math.max(res,ans);
            if(height[l]<=height[r]){
                l++;
            }else {
                r--;
            }
        }
        return res;
    }

    static int maxArea(int[] height) {
//        Brute force approach takes O(N2)
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int ans = Math.min(height[i],height[j])*(j-i);
                res = Math.max(ans,res);
            }
        }
        return res;
    }

}
