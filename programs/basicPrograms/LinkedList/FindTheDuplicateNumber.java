package dsaWithJava.functions.LinkedList;

https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int sol = findDuplicate(arr);
        System.out.println(sol);
    }

    static int findDuplicate(int[] nums) {
//        Implementation of Floyd's Tortoise Hare Algorithm.
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(fast != slow);

        int slow2 = 0;
        do{
            slow = nums[slow];
            slow2 = nums[slow2];
        } while(slow != slow2);

        return slow;
    }
}
