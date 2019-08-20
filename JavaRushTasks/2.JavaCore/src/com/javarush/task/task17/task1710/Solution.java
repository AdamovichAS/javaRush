package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            switch (args[0]) {
                case "-c": {
                    if (args[2].equals("м")) {
                        allPeople.add(Person.createMale(args[1], dateFormat.parse(args[3])));
                    } else {
                        allPeople.add(Person.createFemale(args[1], dateFormat.parse(args[3])));
                    }
                    System.out.println(allPeople.size() - 1);
                }break;

                case "-u": {
                    Person person = allPeople.get(Integer.parseInt(args[1]));
                    if (args[3].equals("м")) {
                        person.setName(args[2]);
                        person.setSex(Sex.MALE);
                        person.setBirthDate(dateFormat.parse(args[4]));
                    } else {
                        person.setName(args[2]);
                        person.setSex(Sex.FEMALE);
                        person.setBirthDate(dateFormat.parse(args[4]));
                    }
                }break;

                case "-d": {
                    Person person = allPeople.get(Integer.parseInt(args[1]));
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                }break;

                case "-i": {
                    Person person = allPeople.get(Integer.parseInt(args[1]));
                    if (person.getSex() == Sex.MALE) {
                        System.out.println(person.getName() + " м " + dateFormat1.format(person.getBirthDate()));
                    } else {
                        System.out.println(person.getName() + " ж " + dateFormat1.format(person.getBirthDate()));

                    }
                }
            }
        } catch (Exception e) {

        }
    }
}
