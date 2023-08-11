package dsaWithJava.functions.Array;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class MinCostToMoveChips {
    public static void main(String[] args) {
        int[] arr = {2,3,3};
        int ans = minCostToMoveChips(arr);
        System.out.println(ans);
    }

    static int minCostToMoveChips(int[] position) {
        int count = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < position.length; i++) {
            if(position[i]%2 == 0){
                even++;
            }
        }
        for (int i = 0; i < position.length; i++) {
            if(position[i]%2 != 0){
                odd++;
            }
        }

        if(even>odd){
            for (int i = 0; i < position.length ; i++) {
                if(position[i]%2 != 0){
                    count++;
                }
            }
        }else {
            for (int i = 0; i < position.length; i++) {
                if (position[i]%2 == 0){
                    count++;
                }
            }
        }


        return count;
    }

}
