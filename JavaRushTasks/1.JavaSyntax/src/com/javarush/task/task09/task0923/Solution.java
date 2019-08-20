package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String arr = "";
        String arry = "";
        //char[] arr = new char[100];
        //char[] arry = new char[100];
        String str = reader.readLine();
        char[]q = str.toCharArray();
        for(int i=0;i<q.length;i++) {
            if (q[i] == ' ') {
                continue;
            } else {
                if (isVowel(q[i]) == true)
                    arr = arr + q[i] + " ";
                else
                    arry = arry + q[i] + " ";
            }
        }

        System.out.println(arr);
        System.out.println(arry);
        }

        // метод проверяет, гласная ли буква
        public static boolean isVowel(char c) {
            c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

            for (char d : vowels)   // ищем среди массива гласных
            {
                if (c == d)
                    return true;
            }
            return false;
        }

}