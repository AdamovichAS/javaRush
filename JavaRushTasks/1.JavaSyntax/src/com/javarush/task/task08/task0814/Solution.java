package com.javarush.task.task08.task0814;

import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> hash = new HashSet<>(20);
        for (int i = 0; i < 20; i++)
            hash.add(i);
        return hash;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        HashSet<Integer> set1 = new HashSet<>(set);
        for (int i : set1) {
            if (i > 10)
                set.remove(i);
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
