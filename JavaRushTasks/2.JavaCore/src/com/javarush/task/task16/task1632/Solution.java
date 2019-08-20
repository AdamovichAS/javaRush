package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new T1()));
        threads.add(new Thread(new T2()));
        threads.add(new Thread(new T3()));
        threads.add(new T4());
        threads.add(new Thread(new T5()));
    }

    public static class T1 implements Runnable {
        @Override
        public void run() {
            while (true);
        }
    }

    public static class T2 implements Runnable {
        @Override
        public void run() {
            try {
                while (true){
                    Thread.sleep(1);
                }
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }

    public static class T3 implements Runnable {
        @Override
        public void run() {
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

    public static class T4 extends Thread implements Message {
        boolean repeat = true;

        @Override
        public void showWarning() {
            repeat = false;
        }

        @Override
        public void run() {
            while (repeat);
        }
    }

    public static class T5 implements Runnable {
        @Override
        public void run() {
            int res = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
            {
                do {
                    String s = reader.readLine();
                    if (s.equals("N")){
                        System.out.println(res);
                        break;
                    }
                    res += Integer.parseInt(s);
                }while (true);

            }catch (IOException e){
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {

    }
}