package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        int count = 1;
        ArrayList<Character> chars = new ArrayList<>();
        while (reader1.ready()){
            int buf = reader1.read();
            if(count%2 ==0){
                writer.write(buf);
            }
            count++;
        }
        reader1.close();
        writer.close();
    }


}
