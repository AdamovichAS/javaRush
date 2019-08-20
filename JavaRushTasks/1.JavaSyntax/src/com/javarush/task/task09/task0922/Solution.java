package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        Date date = simpleDateFormat2.parse(reader.readLine());

        System.out.println(SimpleDateFormat.format(date).toUpperCase());

    }
}

