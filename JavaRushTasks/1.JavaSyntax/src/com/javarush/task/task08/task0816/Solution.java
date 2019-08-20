package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put ( "Vasya", df.parse ( "AUGUST 1 1980" ) );
        map.put ("Inga", df.parse ( "SEPTEMBER 20 1995" ));
        map.put ( "Kolya", df.parse ( "OCTOBER 5 2018" ) );
        map.put ( "Dima", df.parse ( "DECEMBER 12 2012" ) );
        map.put ( "Tema", df.parse ( "February 1 2010" ) );
        map.put ( "Yuriy", df.parse ( "JUNE 29 1970" ) );
        map.put ( "Peter", df.parse ( "JUNE 28 1970" ) );
        map.put ( "Leonid", df.parse ( "JUNE 27 1970" ) );
        map.put ( "Gera", df.parse ( "JUNE 26 1970" ) );

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Date date = new Date();
            date = itr.next ().getValue ();
            LocalDate localDate = date.toInstant().atZone( ZoneId.systemDefault()).toLocalDate();
            int month = localDate.getMonthValue();
            if (month >5 && month <9) itr.remove ();
        }








    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople ( createMap () );
    }
}