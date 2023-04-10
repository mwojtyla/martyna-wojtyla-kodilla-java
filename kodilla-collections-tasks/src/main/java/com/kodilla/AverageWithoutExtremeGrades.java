package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class Book {
    String title;
    int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.title;
    }

}

class Lists {
    public static void main(String[] args) {

        // Average without extreme grades
        List<Integer> gradesIt = new ArrayList<>();
        gradesIt.add(5);
        gradesIt.add(4);
        gradesIt.add(5);
        gradesIt.add(6);
        gradesIt.add(4);
        gradesIt.add(3);
        gradesIt.add(3);
        gradesIt.add(5);
        gradesIt.add(5);
        gradesIt.add(4);
        gradesIt.add(6);
        gradesIt.add(6);

        int max = Collections.max(gradesIt);
        int min = Collections.min(gradesIt);
        double sum = 0;
        double average = 0;

        for (int i = 0; i < gradesIt.size(); i++) {
            sum = sum + gradesIt.get(i);
            average = (sum - max - min) / (gradesIt.size() - 2);
        }
        System.out.println("The average of grades from Computer Science is " + average);

        // List of Books
        Book bookOne = new Book("Love Story", 1970);
        Book bookTwo = new Book("Doctors", 1988);
        Book bookThree = new Book("Dear John", 2006);
        Book bookFour = new Book("The Notebook", 1996);
        Book bookFive = new Book("The Lucky One", 2008);

        List<Book> books = new LinkedList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.add(bookFour);
        books.add(bookFive);

        for (Book book : books) {

            if (book.year >= 2000) {
                System.out.println(book.getTitle() + " " + book.getYear());
            }
        }
    }
}