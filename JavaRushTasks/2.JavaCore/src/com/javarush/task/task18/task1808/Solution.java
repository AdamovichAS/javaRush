package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String f1Name = reader.readLine();
        String f2Name = reader.readLine();
        String f3Name = reader.readLine();

        FileInputStream f1 = new FileInputStream(f1Name);
        FileOutputStream f2 = new FileOutputStream(f2Name);
        FileOutputStream f3 = new FileOutputStream(f3Name);

        byte [] buffer = new byte[f1.available()];

        while (f1.available() > 0) {
            f1.read(buffer);
        }

        int count1 = 0;

        if (buffer.length % 2 == 0) {
            count1 = buffer.length / 2;
        }

        if (buffer.length % 2 == 1) {
            count1 = (buffer.length+1) / 2;
        }

        for (int i = 0; i < count1; i++){
            f2.write(buffer [i]);
        }

        for (int i = count1; i < buffer.length; i++) {
            f3.write(buffer [i]);
        }

        f1.close();
        f2.close();
        f3.close();
    }
}
