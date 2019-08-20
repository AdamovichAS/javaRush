package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream f = new FileInputStream(fileName);
        Map<Integer,Integer> arr = new HashMap<>();
        while (f.available() > 0){
            int oneByte = f.read();
            if(arr.containsKey(oneByte)){
                arr.replace(oneByte,arr.get(oneByte)+1);
            }else {
                arr.put(oneByte,1);
            }
        }
        f.close();
        Set<Map.Entry<Integer, Integer>> entries = arr.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        int max = -1;
        while (iterator.hasNext()){
            int currentValue = iterator.next().getValue();
            if(currentValue >= max){
                max = currentValue;
            }else {
                iterator.remove();
            }
        }
        for (Integer integer : arr.keySet()) {
            System.out.print(integer + " ");
        }
    }
}