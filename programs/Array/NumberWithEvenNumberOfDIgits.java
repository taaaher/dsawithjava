package dsaWithJava.functions.Array;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class NumberWithEvenNumberOfDIgits {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        int count = findNumbers(arr);
        System.out.println(count);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int itr=0;
            while (number > 0){
                number = number/10;
                itr++;
            }
            if(itr%2 == 0){
                count++;
            }
        }
        return count;
    }
}

