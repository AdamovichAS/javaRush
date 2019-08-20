package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Pattern pattern = Pattern.compile("^[А-Яа-яёЁ -]+");
        Matcher matcher;
        String line;
        while ((line = reader.readLine()) != null) {
            matcher = pattern.matcher(line);
            String name;
            while (matcher.find()) {
                name = matcher.group().trim();
                Date dateFormat = new SimpleDateFormat("dd MM yyyy").parse(line.replace(name, "").trim());
                PEOPLE.add(new Person(name,dateFormat));
            }

        }
        reader.close();
    }
}
