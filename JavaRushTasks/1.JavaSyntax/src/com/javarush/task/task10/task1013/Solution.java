package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private String name;
        private int age;
        private boolean sex;
        private String work;
        private String city;
        private boolean children;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age =age;
        }
        public Human(String name, int age,boolean sex){
            this.name = name;
            this.age =age;
            this.sex =sex;
        }
        public Human(String name,boolean sex){
            this.name = name;
            this.sex =sex;
        }
        public Human(String name,boolean sex, String work, boolean children){
            this.name = name;
            this.sex =sex;
            this.work = work;
            this.children = children;
        }
        public Human(String name,boolean sex, String city){
            this.name = name;
            this.sex =sex;
            this.city = city;
        }
        public Human(String name,boolean sex, boolean children){
            this.name = name;
            this.sex =sex;
            this.children =children;
        }
        public Human(String name,boolean sex, int age){
            this.name = name;
            this.sex =sex;
            this.age = age;
        }
        public Human(String name,boolean sex, boolean children, int age){
            this.name = name;
            this.sex =sex;
            this.children =children;
            this.age =age;
        }
        public Human(String name,boolean sex,int age, boolean children){
            this.name = name;
            this.sex =sex;
            this.children =children;
            this.age =age;
        }
    }
}
