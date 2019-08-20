package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        String m = reader.readLine();
        int y = Integer.parseInt(m);
        if (i <= 0 || y <= 0) throw new Exception();


        int r;
        while (y != 0) {
            r = i % y;
            i = y;
            y = r;
        }
        System.out.println(i);
    }
}
