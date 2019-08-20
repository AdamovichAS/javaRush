package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int maxcount = 1;
        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 1; i < 10; i++){
            if (list.get(i) == (list.get(i+1))) {
                count++;
                if ((i == list.size() - 1) && (count > maxcount)) {
                    maxcount = count;
                    
                }
            }
            else {
                if (count > maxcount)
                    maxcount = count;
                count = 1;
            }
        }
        System.out.println(maxcount);
    }
}