package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2,true));
        StringBuffer buffer = new StringBuffer();
        while (reader1.ready()){
            buffer.append(reader1.readLine());
        }
        String result = buffer.toString().replaceAll("[.]", "!");
        writer.write(result);
        reader1.close();
        writer.close();
    }
}
