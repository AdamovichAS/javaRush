package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 2 2013"));
    }

    public static boolean isDateOdd(String date) {
        String[] dates = date.split(" ");

        int day = Integer.parseInt(dates[1]);
        int year = Integer.parseInt(dates[2]);
        int month = 0;

        switch (dates[0]) {
            case "JANUARY":
                month = 0;
                break;
            case "FEBRUARY":
                month = 1;
                break;
            case "MARCH":
                month = 2;
                break;
            case "APRIL":
                month = 3;
                break;
            case "MAY":
                month = 4;
                break;
            case "JUNE":
                month = 5;
                break;
            case "JULY":
                month = 6;
                break;
            case "AUGUST":
                month = 7;
                break;
            case "SEPTEMBER":
                month = 8;
                break;
            case "OCTOBER":
                month = 9;
                break;
            case "NOVEMBER":
                month = 10;
                break;
            case "DECEMBER":
                month = 11;
                break;
        }


        GregorianCalendar startTime = new GregorianCalendar(year, Calendar.JANUARY, 1);
        GregorianCalendar newTime = new GregorianCalendar(year, month, day);

        long delta = newTime.getTimeInMillis() - startTime.getTimeInMillis();
        int days = (int) (delta / (1000 * 60 * 60 * 24));
        days++;

        if (days % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
