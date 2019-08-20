package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> rost = new HashSet<>(10);
        rost.add("арбуз");
        rost.add("банан");
        rost.add("вишня");
        rost.add("груша");
        rost.add("дыня");
        rost.add("ежевика");
        rost.add("женьшень");
        rost.add("земляника");
        rost.add("ирис");
        rost.add("картофель");

        for (String text : rost){
            System.out.println(text);
        }

    }
}
