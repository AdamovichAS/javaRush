package com.javarush.task.task25.task2512;

/* 
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {

        Throwable th = e;
        if (th != null) {
            t.interrupt();
            uncaughtException(t, th.getCause());
            System.out.println(th);
        }
    }

    public static void main(String[] args) {
    }
}
