package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream f = new FileInputStream(fileName);
        int code = (int)',';
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(code,0);
        while (f.available() > 0){
            if(map.containsKey(f.read())){
                map.replace(code,map.get(code) + 1);
            }
        }
        f.close();
        System.out.println(map.get(code));
    }
}
