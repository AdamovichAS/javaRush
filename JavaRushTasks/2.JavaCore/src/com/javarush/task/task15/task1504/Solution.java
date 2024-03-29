package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            if(this instanceof MarkTwainBook) {
                return getBook().getTitle() + " was written by " + author;
            }else {
                return author + ": " + getBook().getTitle() + " is a detective";
            }

        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        private String title;
        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }

        public MarkTwainBook(String tom_sawyer) {
            super("Mark Twain");
            this.title = tom_sawyer;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title;
        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }

        public AgathaChristieBook(String tom_sawyer) {
            super("Agatha Christie");
            this.title = tom_sawyer;
        }
    }
}
