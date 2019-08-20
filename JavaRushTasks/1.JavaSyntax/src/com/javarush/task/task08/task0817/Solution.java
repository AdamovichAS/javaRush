package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("Петров","Сергей");
        maps.put("Иванов","Иван");
        maps.put("Сидоров","Сергей");
        maps.put("Ливанов","Антон");
        maps.put("Горбунов","Евгений");
        maps.put("Горбачев","Иван");
        maps.put("Семенов","Сергей");
        maps.put("Степаненко","Арсений");
        maps.put("Лызлов","Алексей");
        maps.put("Тимофеев","Иван");
        return maps;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String,String> copy = new HashMap<>(map);

        for (Map.Entry<String,String> pair1 : copy.entrySet()){
            int countRepeats = 0;
            for (Map.Entry<String, String> pair2 : copy.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue())){ countRepeats++;}
                if (countRepeats > 2) {
                    removeItemFromMapByValue(map, pair2.getValue());
                }
            }

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
       /* HashMap<String, String> map = new HashMap<String, String>(createMap());
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);*/

    }
}
