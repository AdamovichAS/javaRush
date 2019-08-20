package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            String[] split = reader.readLine().split(" ");
            for (String s : split) {
                s.trim();
                if(s.length() > 6){
                    sb.append(s).append(",");
                }
            }
        }
        sb.deleteCharAt(sb.length()-1);
        reader.close();
        writer.write(sb.toString());
        writer.close();
    }
}
