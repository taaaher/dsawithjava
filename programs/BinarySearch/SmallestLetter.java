package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static void main(String[] args) {
        
    }
    static int ceiling(int[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        if(target > letters[letters.length-1]){
            return -1;
        }

        while(start <= end){
            // find the mid.
            int mid = start + ((end - start) / 2);

            if(target < letters[mid]){

                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
