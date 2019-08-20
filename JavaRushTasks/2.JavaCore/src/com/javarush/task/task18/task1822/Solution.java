package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
        boolean find  = false;
        String line;
        Pattern pattern = Pattern.compile("^[0-9]+");
        Matcher matcher;
        while ((line = reader1.readLine()) != null|| !find){
            matcher = pattern.matcher(line);
            while (matcher.find()){
                if(matcher.group().equals(args[0])){
                    System.out.println(line);
                    find = true;
                }
            }

        }
        reader1.close();

    }


}