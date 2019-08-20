package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {labels.put(10.0,"df");}
    static {labels.put(103.0,"df");}
    static {labels.put(102.0,"df");}
    static {labels.put(110.0,"df");}
    static {labels.put(1.0,"df");}

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
