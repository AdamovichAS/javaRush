package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            String file3 = reader.readLine();
            BufferedReader re1 = new BufferedReader(new FileReader(file2));
            BufferedReader re2 = new BufferedReader(new FileReader(file3));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file1,true));
            String line;
            while ((line = re1.readLine())!=null){
                writer.write(line);
            }
            while ((line = re2.readLine())!=null){
                writer.write(line);
            }
            re1.close();
            re2.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
