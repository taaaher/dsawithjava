package dsaWithJava.functions.Array;

//https://leetcode.com/problems/maximum-population-year/
public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049}};
        int ans = maximumPopulation(logs);
        System.out.println(ans);
    }

    static int maximumPopulation(int[][] logs) {
        int[] count = new int[101];
        int max = 0;
        int year = -1;
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1] ; j++) {
                count[j-1950]++;
            }
        }

        for (int i = 0; i < 101; i++) {
            if(count[i] > max){
                max = count[i];
                year = i+1950;
            }
        }

        return year;
    }
}
