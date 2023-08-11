package dsaWithJava.functions.BitManipulation;

public class FindUniq {
    public static void main(String[] args) {
        int arr [] = {2,3,4,1,2,1,3,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int uniq = 0;
        for(int n : arr){
            uniq = uniq ^ n;
        }
        return  uniq;
    }
}
