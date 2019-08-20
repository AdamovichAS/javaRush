package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        String line;
        BufferedReader reader1 = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        while ((line = reader1.readLine())!= null){
            System.out.println(sb.append(line).reverse());
            sb.delete(0,sb.length());
        }
        reader.close();
        reader1.close();
    }
}
