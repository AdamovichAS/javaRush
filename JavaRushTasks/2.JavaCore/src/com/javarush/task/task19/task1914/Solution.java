package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ArrayList<String> list = new ArrayList<>();
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

        //разворачиваем строку
//        result = result.replaceAll("\\D", "");
        int res;
        String sl="";
        for (int i = 0; i < result.length(); i++) {
            sl += result.charAt(i);
            if(result.charAt(i) == 32) {
                list.add(sl.trim());
                sl="";
            }
        }
        result = result.replaceAll("\\r\\n", "");

        if(list.get(1).equals("-")) {
            result += Integer.parseInt(list.get(0))-Integer.parseInt(list.get(2));
            System.out.print(result);
        }
        if(list.get(1).equals("+")){
            result += Integer.parseInt(list.get(0))+Integer.parseInt(list.get(2));
            System.out.print(result);
        }
        if(list.get(1).equals("*")) {
            result += Integer.parseInt(list.get(0))*Integer.parseInt(list.get(2));
            System.out.print(result);
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
