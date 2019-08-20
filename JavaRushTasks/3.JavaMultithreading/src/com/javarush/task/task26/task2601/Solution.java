package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
        Integer[]arr = {8, 4, 1, -5, 2, 7, 16, 15, 9, 0, -2, -9, -4, 20};
        sort(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }

    public static Integer[] sort(Integer[] array) {
        int meiana;
        Arrays.sort(array);
        for (Integer integer : array) {
            System.out.println(integer);
        }
        if(array.length%2 == 1){
            meiana = array[array.length/2];
        }else {
            meiana = (array[array.length/2] + array[array.length/2-1])/2;
        }
        System.out.println("Mediana "+ meiana);

        Comparator<Integer> medianaComp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int delta1 = Math.abs(o1-meiana);
                int delta2 = Math.abs(o2 - meiana);
                if(delta1 - delta2 == 0) {
                    return o1 - o2;
                }else {
                    return delta1 - delta2;
                }
            }
        };

        Arrays.sort(array,medianaComp);
        return array;
    }
}
