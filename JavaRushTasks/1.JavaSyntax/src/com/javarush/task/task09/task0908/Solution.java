package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {


            String s = null;
            String m = s.toLowerCase();
            String k = m + m;
        }
        catch (NullPointerException e){
            System.out.println("null " + e);
        }
        //напишите тут ваш код
    }
}
