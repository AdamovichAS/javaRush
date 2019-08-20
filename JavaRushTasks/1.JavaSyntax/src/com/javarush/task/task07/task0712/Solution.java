package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String>list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i ++)
            list.add(reader.readLine());

        int max = list.get(0).length();
        int min = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > max)
                max = list.get(i).length();
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < min)
                min = list.get(i).length();
        }
        int minIn = 0;//переменная для индекса в листе первой встреченной max строки
        int maxIn = 0;//переменная для индекса в листе первой встреченной min строки
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) {
                maxIn = i;
                break;
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() == min) {
                minIn = i;
                break;
            }
        }
        if (maxIn < minIn)//сравниваем индексы и выводим первую
            System.out.println(list.get(maxIn));
        else
            System.out.println(list.get(minIn));
    }
}
