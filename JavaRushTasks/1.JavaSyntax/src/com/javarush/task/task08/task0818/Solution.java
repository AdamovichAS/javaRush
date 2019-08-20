package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("name1",490);
        maps.put("name2",502);
        maps.put("name3",494);
        maps.put("name4",495);
        maps.put("name5",560);
        maps.put("name6",580);
        maps.put("name7",590);
        maps.put("name8",540);
        maps.put("name9",560);
        maps.put("name10",470);
        return maps;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> map1 = new HashMap<>(map);
        for (Map.Entry<String, Integer> s : map1.entrySet()){
            if (s.getValue() < 500)
                map.remove(s.getKey());
        }
    }

    public static void main(String[] args) {

    }
}