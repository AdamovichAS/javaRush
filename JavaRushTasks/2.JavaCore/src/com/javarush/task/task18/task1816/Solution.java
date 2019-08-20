package com.javarush.task.task18.task1816;

/* 
Английские буквы
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
            Pattern pattern = Pattern.compile("[\\w]");
            Matcher m;
            int count = 0;
            while ((line = reader.readLine()) != null) {

                m = pattern.matcher(line);
                while (m.find()) {
                    count++;
                }

            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
