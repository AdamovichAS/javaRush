package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName ="D:\\Java\\JavaRush\\JavaRushTasks\\file\\test.txt";
        reader.close();
        int maxId = getMaxIdInFile(fileName);
        if (args.length != 0) {
            if (args[0].equals("-c")) {
                PrintWriter writer = new PrintWriter(new FileWriter(fileName, true)); // не переписываем старые значения из файла т.к стоит флаг true
                writer.printf("\n%-8d%-30s%-8.2f%-4d", maxId + 1, args[1],Double.parseDouble(args[2]),Integer.parseInt(args[3]));
                writer.close();
            }
        }
    }

    private static int getMaxIdInFile(String fileName) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;
        int maxIdValue = -1;
        Pattern pattern = Pattern.compile("^\\d+"); // находим значение id в каждой строке
        Matcher matcher;
        while ((line = fileReader.readLine()) != null) {
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                String id = matcher.group();
                if (Integer.parseInt(id) > maxIdValue) {
                    maxIdValue = Integer.parseInt(id); // при каждм проходе обновляем значения максимального id
                }
            }
        }
        fileReader.close();
        return maxIdValue;
    }
}
