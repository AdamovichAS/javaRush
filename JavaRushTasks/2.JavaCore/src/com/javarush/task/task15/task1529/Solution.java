package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }



    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (line.equals("helicopter")){
            result = new Helicopter();
        }else if(line.equals("plane")){
            try {
                result = new Plane(Integer.parseInt(reader.readLine()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
