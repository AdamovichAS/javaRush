package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String fileName = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader("D:\\Java\\JavaRush\\JavaRushTasks\\file\\read.txt"));
        Pattern pattern = Pattern.compile("(?<![А-Яа-яёЁA-Za-z])[0-9]+(?![А-Яа-яёЁA-Za-z]+)");
        Matcher matcher;
        String line;
        StringBuffer sb = new StringBuffer();
        while ((line = reader1.readLine()) != null){
            sb.append(line);
            matcher = pattern.matcher(sb);
            while (matcher.find()){
                int find = Integer.parseInt(matcher.group());
                if(find < 13){
                    sb.replace(matcher.start(),matcher.end(),map.get(find));
                    matcher.reset();
                }
            }
            System.out.println(sb);
            sb.delete(0,sb.length());
        }
        reader1.close();
    }
}
