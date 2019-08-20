package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            double count2 = 0;
            Pattern pattern = Pattern.compile("[ ]");
            Matcher m;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                count2 += line.length();
                m = pattern.matcher(line);
                while (m.find()) {
                    count++;
                }

            }

            System.out.println(String.format("%.2f",(count/count2)*100));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
