package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[1];
        String fileOutputName = args[2];

        switch (args[0]) {
            case ("-e"):
                encrypt(fileName, fileOutputName);
                break;
            case ("-d"):
                decrypt(fileName, fileOutputName);
                break;
        }
    }

    public static void encrypt(String fileName, String fileOutputName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileOutputName);

        while (fis.available() > 0) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            for (int i = 0; i < buffer.length; i++) {
                buffer[i]++;
                fos.write(buffer[i]);
            }
        }
        fis.close();
        fos.close();
    }

    public static void decrypt(String fileName, String fileOutputName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileOutputName);

        while (fis.available() > 0) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            for (int i = 0; i < buffer.length; i++) {
                buffer[i]--;
                fos.write(buffer[i]);
            }
        }
        fis.close();
        fos.close();
    }
}