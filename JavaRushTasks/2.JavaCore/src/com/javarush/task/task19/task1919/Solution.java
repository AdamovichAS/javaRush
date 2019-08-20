package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String,Double>map = new TreeMap<>();
        while (reader.ready()){
            String[] split = reader.readLine().split(" ");
            if (!map.containsKey(split[0])){
                map.put(split[0],Double.parseDouble(split[1]));
            }else {
                map.replace(split[0],map.get(split[0]) + Double.parseDouble(split[1]));
            }
        }
        reader.close();
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
