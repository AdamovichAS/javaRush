package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Random;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = reader1.readLine()) != null) {
            sb.append(line).append(" ");
        }
        String[] split = sb.toString().trim().split(" ");

        StringBuilder result = getLine(split);
        System.out.println(result.toString());
    }

    private static StringBuilder getLine(String... words) {
        if(words.length > 1) {
            Deque<String> deque = new ArrayDeque<>(Arrays.asList(words));
            StringBuilder sb = findFirstPair(deque);
            int count = deque.size() * 2; //на случай бесконечного цикла, если будут не групперуемые слова
            while (deque.size() > 0 && count > 0) {
                char lastChar = sb.toString().toLowerCase().charAt(sb.length() - 2);// -2 потому что последний символ это " "
                String word = deque.poll();
                if (word.toLowerCase().charAt(0) == lastChar) {
                    sb.append(word).append(" ");
                } else {
                    deque.addLast(word);
                    count--;
                }
            }
            if (count == 0) {
                for (int i = 0; i < words.length; i++) {
                    replacePosition(words);
                }
                sb.delete(0, sb.length());
                return getLine(words);
            }
            return sb;
        }else {
            return new StringBuilder();
        }
    }

    private static void replacePosition(String[] words) {
        Random random = new Random();
        int replacmentIndex1 = random.nextInt(words.length);
        int replacmentIndex2 = random.nextInt(words.length);
        String buffer = words[replacmentIndex1];
        words[replacmentIndex1] = words[replacmentIndex2];
        words[replacmentIndex2] = buffer;

    }

    private static StringBuilder findFirstPair(Deque<String> deque) {
        StringBuilder sb = new StringBuilder();
        int count = deque.size();
        boolean find = false;
        while (count > 0 && !find) {
            String word = deque.poll();
            char firstChar = word.toLowerCase().charAt(0);
            char lastChar = word.toLowerCase().charAt(word.length() - 1);
            for (int i = 0; i < deque.size(); i++) {
                String s = deque.poll();
                if (s.toLowerCase().charAt(0) == lastChar) {
                    sb.append(word).append(" ").append(s).append(" ");
                    find = true;
                    break;
                } else if (s.toLowerCase().charAt(s.length() - 1) == firstChar) {
                    sb.append(s).append(" ").append(word).append(" ");
                    find = true;
                    break;
                } else {
                    deque.addLast(s);
                    count--;
                }
            }

        }
        return sb;
    }
}