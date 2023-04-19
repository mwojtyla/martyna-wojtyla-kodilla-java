package com.kodilla.speedmeasurement;

public class Book {
    String author;
    String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        Book b = (Book) o;
        return this.author.equals(b.author) && this.title.equals(b.title);
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }


    @Override
    public String toString() {
        return author + " " + title;
    }

    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
}
