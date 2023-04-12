package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;


class Books {
    String author;
    String title;
    Integer year;

    public Books(String author, String title, Integer year){
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        Books b = (Books) o;
        return this.author.equals(b.author) && this.title.equals(b.title) && this.year.equals(b.year);
    }

    @Override
    public int hashCode() {
        return this.year;
    }

    @Override
    public String toString() {
        return author + " " + title + " " + year;
    }

    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public Integer getYear(){
        return this.year;
    }

}

public class HashSetOfBooks {
    public static void main (String[] args) {

        Books book1 = new Books("Erich Segal", "Love Story", 1970);
        Books book2 = new Books("Erich Segal", "Doctors", 1988);
        Books book3 = new Books("Nicholas Sparks", "Dear John", 2006);
        Books book4 = new Books("Nicholas Sparks", "The Notebook", 1996);
        Books book5 = new Books("Nicholas Sparks", "The Longest Ride", 2014);
        Books book6 = new Books("Nicholas Sparks", "The Best Of Me", 2011);


        Set<Books> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);


        for (Books theBook: bookSet){

            if (theBook.year<2010){
                System.out.println(theBook.getTitle());

            }
        }
    }
}