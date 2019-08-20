package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream f = new FileInputStream(fileName);
        Set<Integer> arr = new TreeSet<>();
        while (f.available() > 0){
            arr.add(f.read());

        }
        f.close();
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}
