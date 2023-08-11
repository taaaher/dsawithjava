package dsaWithJava.functions.BinarySearch;

//https://leetcode.com/problems/time-based-key-value-store/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {


    public static void main(String[] args) {

    }

    private static Map<String, List<ValueTime>> map;

    public  TimeBasedKeyValueStore(){
//        Creates hashmap
         map = new HashMap<>();
    }

    public static void set (String key, String value, int timestamp){
//        if the map is empty add an arraylist
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
//        Else append to the already created list.
        map.get(key).add(new ValueTime(value, timestamp));
    }
    public static String get (String key, int timestamp){
//        if the map doesnot contian the key return empty string.
        if(!map.containsKey(key)){
            return "";
        }
//        otherwise  get the list from the map and store its value is list.
        List<ValueTime> list = map.get(key);
//        and search the list for the timestamp.
        return search(list, timestamp);
    }

    private static String search(List<ValueTime> list, int timestamp) {
        int s = 0;
        int e = list.size()-1;

        while (s<e){
            int m = s + (e-s+1)/2;
            if(list.get(m).timestamp <= timestamp){
                s = m;
            }else {
                e = m-1;
            }
        }
//        if the timestamp is less than or equal to the given timestamp then return the value.
        if(list.get(s).timestamp <= timestamp){
            return list.get(s).value;
        }else {
            return "";
        }
    }

//    Below is the constructor class for the creation of the ValueTime DataStructure.
    public static class ValueTime{
        String value;
        int timestamp;
        ValueTime(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }

}
