package com.javarush.task.task19.task1920;

/* 
Самый богатый
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
        Map<String,Double> map = new TreeMap<>();
        double maxValue = -1;
        while (reader.ready()){
            String[] split = reader.readLine().split(" ");
            if (!map.containsKey(split[0])){
                map.put(split[0],Double.parseDouble(split[1]));
                if(Double.parseDouble(split[1]) > maxValue){
                    maxValue = Double.parseDouble(split[1]);
                }
            }else {
                map.replace(split[0],map.get(split[0]) + Double.parseDouble(split[1]));
                if(map.get(split[0]) > maxValue){
                    maxValue = map.get(split[0]);
                }
            }
        }
        reader.close();
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue() == maxValue) {
                System.out.println(entry.getKey());
            }
        }
    }
}
