package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream f = new FileInputStream(fileName);
        int[] arr = new int[f.available()];
        int i = 0;
        while (f.available() > 0){
            arr[i++] = f.read();

        }
        f.close();
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}