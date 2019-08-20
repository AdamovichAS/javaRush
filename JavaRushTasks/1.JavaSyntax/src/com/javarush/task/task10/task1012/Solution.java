package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Количество букв
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<String> alphabet = Arrays.asList(
                "а", "б", "в", "г", "д", "е", "ё", "ж",
                "з", "и", "й", "к", "л", "м", "н", "о",
                "п", "р", "с", "т", "у", "ф", "х", "ц",
                "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я");

        Map<String, Integer> alphabetCount = new TreeMap<>();
        for (String character : alphabet) {
            alphabetCount.put(character, 0);
        }
        Pattern pattern = Pattern.compile("[А-Яа-яёЁ]");
        Matcher matcher;
        // Ввод строк
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            s = s.toLowerCase();
            matcher = pattern.matcher(s);
            while (matcher.find()) {
                String leter = matcher.group();
                if (alphabetCount.containsKey(leter)) {
                    alphabetCount.replace(leter, alphabetCount.get(leter), alphabetCount.get(leter) + 1);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entries = alphabetCount.entrySet();
        ArrayList<String>listKey = new ArrayList<>();
        ArrayList<Integer>listValue = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entries) {
            listKey.add(entry.getKey());
            listValue.add(entry.getValue());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(listKey.get(i) + " " + listValue.get(i));
        }
        System.out.println(listKey.get(32) + " " + listValue.get(32));
        for (int i = 6; i < 32; i++) {
            System.out.println(listKey.get(i) + " " + listValue.get(i));
        }

    }
}

