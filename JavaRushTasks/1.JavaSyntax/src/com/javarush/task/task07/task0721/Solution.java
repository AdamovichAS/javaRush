package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int []mass = new int[20];
        mass[0] = Integer.parseInt(reader.readLine());
        int maximum = mass[0];
        int minimum = mass[0];

        for (int i =1; i < mass.length; i++){
            mass[i] = Integer.parseInt(reader.readLine());
            if (mass[i] < minimum)
                minimum = mass[i];
            else if (mass[i] > maximum)
                maximum = mass[i];
        }
        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
