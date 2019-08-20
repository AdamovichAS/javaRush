package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2,true));
        String line;
        Pattern pattern = Pattern.compile("(?<![\\wа-яА-ЯёЁ])[0-9]+(?![\\wА-Яа-яёЁ])");
        Matcher m;
        while ((line = reader1.readLine())!=null){
            m = pattern.matcher(line);
            while (m.find()){
                writer.write(m.group() + " ");
            }
        }
        reader1.close();
        writer.close();
    }
}
