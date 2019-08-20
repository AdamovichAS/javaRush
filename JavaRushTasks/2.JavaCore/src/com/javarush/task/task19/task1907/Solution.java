package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(line));
        String line2;
        int count = 0;
        while ((line2 = reader1.readLine())!= null){
            String[] split = line2.split("[^\\w]+");
            for (String s : split) {
                if(s.equals("world")){
                    count++;
                }
            }
        }
        reader1.close();
        System.out.println(count);
    }
}
