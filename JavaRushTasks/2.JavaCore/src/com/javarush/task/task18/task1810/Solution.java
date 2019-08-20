package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean read = true;
        String fileName;
        FileInputStream fileInputStream;
        while (read){
            fileName = reader.readLine();
            fileInputStream = new FileInputStream(fileName);
            if(fileInputStream.available() < 1000){
                read = false;
                fileInputStream.close();
                throw new DownloadException("dfd");
            }else {
                byte []buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer);
                fileInputStream.close();

            }
        }



    }

    public static class DownloadException extends Exception {
        public DownloadException(String message) {

        }
    }
}
