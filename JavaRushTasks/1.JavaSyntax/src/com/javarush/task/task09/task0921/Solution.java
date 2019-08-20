package com.javarush.task.task09.task0921;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        List<Integer>numbers = new ArrayList<>();
        while (true){
            try {
                numbers.add(Integer.parseInt(sc.nextLine()));
            } catch (NumberFormatException e) {
                for (Integer number : numbers) {
                    System.out.println(number);
                }
            }
        }

    }
}
