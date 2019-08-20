package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Thread readThread;
        while (!(line = reader.readLine()).equals("exit")){
            readThread = new ReadThread(line);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) {
            super(fileName);
        }
        // implement file reading here - реализуйте чтение из файла тут
        private Map<Byte,Integer> map = new HashMap<>();
        @Override
        public void run() {
            try (FileInputStream fileInputStream = new FileInputStream(this.getName())){
                if(fileInputStream.available()>0){
                    byte[] buffer = new byte[fileInputStream.available()];
                    fileInputStream.read(buffer);
                    for (byte b : buffer) {
                        Integer oldValue = map.put(b, 1);
                        if(oldValue != null){
                            map.replace(b,oldValue+1);
                        }
                    }
                    int maxValue = -1;
                    int keyWithMaxValue = -1;
                    Set<Map.Entry<Byte, Integer>> entries = map.entrySet();
                    for (Map.Entry<Byte, Integer> entry : entries) {
                        if(entry.getValue()>maxValue){
                            maxValue = entry.getValue();
                            keyWithMaxValue = entry.getKey();
                        }
                    }
                    resultMap.put(this.getName(),keyWithMaxValue);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
