package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = reader2.readLine())!= null){
            sb.append(line).append("\n");
        }
        sb.delete(sb.length()-1,sb.length());
        while ((line = reader1.readLine())!= null){
            sb.append(line).append("\n");
        }
        sb.delete(sb.length()-1,sb.length());
        reader.close();
        reader1.close();
        reader2.close();
        writer.write(sb.toString());
        writer.close();

    }
}
