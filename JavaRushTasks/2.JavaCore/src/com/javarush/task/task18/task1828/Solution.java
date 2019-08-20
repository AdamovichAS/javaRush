package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "D:\\Java\\JavaRush\\JavaRushTasks\\file\\test.txt";
        reader.close();
        if (args[0].equals("-u")) {
            updateLine(fileName,args);
        }else if(args[0].equals("-d")){
            deleteLine(fileName,args[1]);
        }

    }

    private static void deleteLine(String fileName, String id) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuffer sb = new StringBuffer();
        String line;
        Pattern pattern = Pattern.compile("^\\d+"); // находим значение id в каждой строке
        Matcher matcher;
        String lineId;
        while ((line = fileReader.readLine()) != null) {
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                lineId = matcher.group();
                if(!lineId.equals(id)){
                    sb.append(line).append("\n");
                }

            }
        }
        fileReader.close();
        PrintWriter writer = new PrintWriter(new FileWriter(fileName));
        writer.write(sb.toString());
        writer.close();
    }
    private static void updateLine(String fileName,String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuffer sb = new StringBuffer();
        String line;
        Pattern pattern = Pattern.compile("^\\d+");
        Matcher matcher;
        String lineId;
        while ((line = fileReader.readLine()) != null) {
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                lineId = matcher.group();
                if(!lineId.equals(args[1])){
                    sb.append(line).append("\n");
                }else {
                    sb.append(String.format("%-8s%-30s%-8.2f%-4d\n",args[1], args[2], Double.parseDouble(args[3]), Integer.parseInt(args[4])));
                }

            }
        }
        fileReader.close();
        PrintWriter writer = new PrintWriter(new FileWriter(fileName));
        writer.write(sb.toString());
        writer.close();
    }
}