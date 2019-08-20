package com.javarush.task.task19.task1904;

/*
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] split = this.fileScanner.nextLine().split(" ");
            String dateD = String.format("%s %s %s",split[3],split[4],split[5]);
            Date date = null;
            try {
                date = new SimpleDateFormat("dd MM yyyy").parse(dateD);
            } catch (ParseException e) {
                e.printStackTrace();
            }
      //      new Person("","","")
            return new Person(split[1],split[2],split[0],date);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
