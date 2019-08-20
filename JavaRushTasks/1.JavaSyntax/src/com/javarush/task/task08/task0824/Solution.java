package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human soon = new Human("Dima",true,20);
        System.out.println(soon.toString());
        Human soon2 = new Human("Dima",true,22);
        System.out.println(soon2.toString());
        Human soon3 = new Human("Dima",true,19);
        System.out.println(soon3.toString());
        Human mother = new Human("Masha",false,50,soon,soon2,soon3);
        System.out.println(mother.toString());
        Human father = new Human("Bob",true,50,soon,soon2,soon3);
        System.out.println(father.toString());
        Human grandfather = new Human("Igor",true,78,mother);
        System.out.println(grandfather.toString());
        Human grandfather1 = new Human("Luk",true,72,father);
        System.out.println(grandfather1.toString());
        Human grandmother = new Human("Ala",false,75,mother);
        System.out.println(grandmother.toString());
        Human grandmother1 = new Human("Ira",false,70,father);
        System.out.println(grandmother1.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age, Human... baby){
            this.name = name;
            this.sex = sex;
            this.age = age;
            children.addAll(Arrays.asList(baby));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;


            try {
                if (!children.isEmpty()) {
                    int childCount = this.children.size();
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            } catch (Exception e) {
                return text;
            }
            return text;
        }
    }

}
