package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive{
    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;

    private List<Human> children = new ArrayList<>();

    protected Size size;

    public class Size{
        public int height;
        public int weight;

        public Size(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }


    }


    private BloodGroup bloodGroup;

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition(){
        return "Человек";
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }


    public int getId() {
        return id;
    }


    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    public List<Human> getChildren(){
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human child){
        children.add(child);
    }

    public void removeChild(Human child){
        children.remove(child);
    }

    @Override
    public void live() {
        
    }
}