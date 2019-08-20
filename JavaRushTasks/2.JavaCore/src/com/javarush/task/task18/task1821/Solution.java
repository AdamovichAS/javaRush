package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
        Map<Byte,Integer> map = new TreeMap<>();
        if (inputStream.available()>0){
            byte [] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            for (byte b : buffer) {
                Integer oldValue = map.put( b, 1);
                if(oldValue != null){
                    map.replace(b,oldValue+1);
                }
            }
            Set<Map.Entry<Byte, Integer>> entries = map.entrySet();
            for (Map.Entry<Byte, Integer> entry : entries) {
                System.out.println((char)((byte)entry.getKey()) + " " + entry.getValue());
            }
        }
        inputStream.close();
    }
}
