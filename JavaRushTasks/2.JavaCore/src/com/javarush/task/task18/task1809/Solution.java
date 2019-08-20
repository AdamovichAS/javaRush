package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName1));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName2));
        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            byte[] reversBuffer = new byte[inputStream.available()];

            inputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                reversBuffer[reversBuffer.length-1-i] = buffer[i];
            }
            outputStream.write(reversBuffer);
        }
        inputStream.close();
        outputStream.close();
    }
}
