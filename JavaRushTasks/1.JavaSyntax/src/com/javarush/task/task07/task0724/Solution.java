package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human vasya = new Human("Vasya", true, 80);
        Human vera = new Human("Vera", false, 80);
        Human vitaliy = new Human("Vitaliy", true, 80);
        Human nastya = new Human("Nastya", false, 80);
        Human kirill = new Human("Kirill", true, 26, vasya, vera);
        Human vika = new Human("Vika", false, 26, vasya, vera);
        Human oleg = new Human("Oleg", true, 26, vitaliy, nastya);
        Human masha = new Human("Masha", false, 26, vitaliy, nastya);
        Human sveta = new Human("Sveta", false, 26, vitaliy, nastya);
        Human [] mans = new Human [] {vasya, vera, vitaliy, nastya, kirill, vika, oleg, masha, sveta};
        for (Human h: mans)
            System.out.println(h);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private  Human father;
        private Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}