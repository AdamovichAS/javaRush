package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[]first = {1, 5, 7, 9, 8};
        int[]second = {2, 3};
        int[]tri = {2, 1, 5, 6};
        int[]chet = {3, 5, 9, 7, 5, 6, 2};
        int[]five = new int[0];
        list.add(0,first);
        list.add(1,second);
        list.add(2,tri);
        list.add(3,chet);
        list.add(4,five);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
