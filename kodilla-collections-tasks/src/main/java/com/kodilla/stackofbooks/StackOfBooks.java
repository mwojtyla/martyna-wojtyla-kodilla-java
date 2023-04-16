package com.kodilla.stackofbooks;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackOfBooks {
    public static void main(String[] args) {

        Book book1 = new Book("Love Story", "Erich Segal", 1970);
        Book book2 = new Book("Doctors", "Erich Segal", 1988);
        Book book3 = new Book("Dear John", "Nicholas Sparks", 2006);
        Book book4 = new Book("The Notebook", "Nicholas Sparks", 1996);
        Book book5 = new Book("The Longest Ride", "Nicholas Sparks", 2014);

        // create the stack
        Deque<Book> theBooks = new ArrayDeque<>();

        // putting 5 objects in a stack
        theBooks.push(book1);
        theBooks.push(book2);
        theBooks.push(book3);
        theBooks.push(book4);
        theBooks.push(book5);

        // checking the size of stack
        System.out.println("Queue is filled. It's size: " + theBooks.size());

        // delete all books
        Book temporaryBook;
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();

        // checking the size of stack after books delete
        System.out.println("Queue is emptied. It's size: " + theBooks.size());

        // display which book was last removed from the stack
        System.out.println("Last book taken from queue was: " + temporaryBook);
    }
}