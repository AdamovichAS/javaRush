package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> Map = new HashMap<>();
        for (int i=0; i<10; i++) {
            Map.put("Васька"+ Integer.toString(i+1), new Cat("Васька"+ Integer.toString(i+1)));
        }
        //for (String key : Map.keySet()) {System.out.println("Key: " + key); }
        return Map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        return  new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
