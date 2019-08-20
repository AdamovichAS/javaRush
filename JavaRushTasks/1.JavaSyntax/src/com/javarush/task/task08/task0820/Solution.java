package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> setCat = new HashSet<Cat>();
        setCat.add(new Cat());
        setCat.add(new Cat());
        setCat.add(new Cat());
        setCat.add(new Cat());
        //напишите тут ваш код

        return setCat;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> setdog = new HashSet<>();
        setdog.add(new Dog());
        setdog.add(new Dog());
        setdog.add(new Dog());
        return setdog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;

    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object i : pets){
            System.out.println(i);
        }
    }

    public static class Cat{
    }
    public static class Dog{}
}
