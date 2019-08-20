package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) {
        String fileName ="";
        while (true) {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

                fileName = reader.readLine();
                FileInputStream fileInput1 = new FileInputStream(fileName);

                fileInput1.close();

            } catch (FileNotFoundException e) {
                //System.out.println(e.getMessage().replace(" (The system cannot find the file specified)", ""));
                System.out.println(fileName);
                return;

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        //System.out.println("End of program");

    }
}