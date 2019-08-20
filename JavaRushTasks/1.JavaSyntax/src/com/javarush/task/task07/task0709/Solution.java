package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(5);
        ArrayList<String> list1 = new ArrayList<>();
        list.add(reader.readLine());
        int min = list.get(0).length();
        for (int i =1; i < 5; i++){
            list.add(reader.readLine());
            if (list.get(i).length() < min)
                min = list.get(i).length();

        }
        for (int i = 0; i < 5; i++){
            if (list.get(i).length() == min)
                list1.add(list.get(i));
        }
        for (int i = 0; i < list1.size(); i++)
        System.out.println(list1.get(i));
    }
}
