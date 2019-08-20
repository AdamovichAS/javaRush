package com.javarush.task.task22.task2202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString(null));
    }

    public static String getPartOfString(String string) {
        if(string == null){
            throw new TooShortStringException();
        }
        Pattern pattern = Pattern.compile(" [^ ]+");
        Matcher matcher;
        matcher = pattern.matcher(string);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (matcher.find() && count < 4){
            sb.append(matcher.group());
            count++;
        }
        if(count != 4){
            throw new TooShortStringException();
        }
        return sb.toString().substring(1);
    }




    public static class TooShortStringException extends RuntimeException{
    }
}
