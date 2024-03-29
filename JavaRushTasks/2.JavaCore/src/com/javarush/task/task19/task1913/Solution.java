package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);
        //поднимаем строку
        StringBuilder stringBuilder = new StringBuilder(result);
        //  stringBuilder.toString().toUpperCase();
        String reverseString = stringBuilder.toString();

        String [] str = reverseString.split("");

        for (int i = 0; i < str.length; i++) {
            try {

                byte[] bytes = str[i].getBytes("US-ASCII");
                if(bytes[0] > 47 && bytes[0] < 58){
                    System.out.print(str[i]);
                }
            }
            catch (UnsupportedEncodingException un){

            }

        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}