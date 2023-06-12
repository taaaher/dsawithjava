package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int arr[] = {2,1,5};
        int k = 806;
        List<Integer> sol = new ArrayList<>();
        sol = addToArrayForm(arr, k);
        System.out.println(Arrays.toString(new List[]{sol}));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        //Brute force approach.
        List<Integer> res = new ArrayList<>();
        for (int i = num.length-1; i >=0 ; i--) {
            res.add(0,(num[i]+k)%10);
            k = (k+num[i])/10;
        }
        while(k>0){
            res.add(0,k%10);
            k=k/10;
        }
        return res;
    }

}
