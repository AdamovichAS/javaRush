package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.List;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            //init wheels here
            String[] strings = loadWheelNamesFromDB();
            wheels = new ArrayList<>();
            if(strings.length != 4){
                throw new Exception();
            } else {
                for (String s : strings) {
                    for (Wheel value : Wheel.values()) {
                        if(value.toString().equals(s)){
                            wheels.add(value);
                            break;
                        }
                    }
                }
                if(wheels.size() != Wheel.values().length){
                    throw new Exception();
                }
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
