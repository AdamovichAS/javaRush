package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename1 = args[0];
        String filename2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(filename1));
        ArrayList<String> list = new ArrayList<>();

        while (reader.ready()) {
            list.add(reader.readLine());
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename2));
        for (String item : list) {
            String[] tmp = item.split(" ");
            for (int i = 0; i < tmp.length; i++) {
                char[] spl = tmp[i].toCharArray();
                for (int j = 0; j < spl.length; j++) {
                    if (spl[j]=='0'||spl[j]=='1'||spl[j]=='2'||spl[j]=='3'||spl[j]=='4'||spl[j]=='5'||spl[j]=='6'||spl[j]=='7'||spl[j]=='8'||spl[j]=='9'){
                        writer.write(tmp[i]);
                        writer.flush();
                        writer.write(" ");
                        break;
                    }

                }
            }
        }
        writer.close();
    }
}