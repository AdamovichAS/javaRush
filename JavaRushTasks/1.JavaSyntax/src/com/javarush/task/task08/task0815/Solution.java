package com.javarush.task.task08.task0815;

import java.util.HashMap;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> names = new HashMap<>();
        names.put("Иванов", "Олег");
        names.put("А", "А");
        names.put("Щ", "Б");
        names.put("В", "А");
        names.put("С", "Р");
        names.put("Ц", "Олег");
        names.put("Г", "И");
        names.put("Ф", "А");
        names.put("ж", "Ь");
        names.put("П", "В");
        return names;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int numberValues = 0;
        for (String values : map.values())
            if (values.equals(name)) numberValues++;
        return numberValues;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int numberKey = 0;
        for (String key : map.keySet())
            if (key.equals(lastName)) numberKey++;
        return numberKey;

    }

    public static void main(String[] args) {
    HashMap<String,String> mapa = createMap();
    int i = getCountTheSameFirstName(mapa,"Олег");
    int j = getCountTheSameLastName(mapa,"А");

    }
}
