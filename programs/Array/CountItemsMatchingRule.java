package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/description/
public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        String ruleKay = "color";
        String ruleValue = "silver";
        int ans = countMatches(items, ruleKay, ruleValue);
        System.out.println(ans);

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int col;
        if(ruleKey.equals("type")){
            for (int i = 0; i < items.size(); i++) {
                if(items.get(i).get(0).equals(ruleValue)){
                count++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if(items.get(i).get(1).equals(ruleValue)){
                    count++;
                }
            }
        }else {
            for (int i = 0; i < items.size(); i++) {
                if(items.get(i).get(2).equals(ruleValue)){
                    count++;
                }
            }
        }

        return  count;
    }
}
