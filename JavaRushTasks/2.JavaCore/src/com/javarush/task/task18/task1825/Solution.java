package com.javarush.task.task18.task1825;

/*
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<String>fileName = new ArrayList<>();
        while (!(line = reader.readLine()).equals("end")){
            fileName.add(line);
        }
        reader.close();
        Collections.sort(fileName);
        String fileForWrite = fileName.get(0).replaceFirst("[.]\\w+$", "");
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileForWrite));
        for (String s : fileName) {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(s));
            byte[]buffer = new byte[inputStream.available()];
            while (inputStream.available()>0){
                inputStream.read(buffer);
            }
            inputStream.close();
            outputStream.write(buffer);
        }
        outputStream.close();
    }
}
