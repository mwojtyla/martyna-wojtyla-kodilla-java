package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Nicholas Sparks", "The Notebook", 1997,"LA123");
        Book book2 = new Book("Erich Segal", "Love Story", 1970,"LA341");
        Book book3 = new Book("Nicholas Sparks", "The Return", 2020,"LA891");
        Book book4 = new Book("Jane Austen", "Pride and Prejudice", 1813,"LA002");
        Book book5 = new Book("Erich Segal", "Doctors", 1988,"LA209");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int publicationYearMedian = medianAdapter.publicationYearMedian(books);
        // Then
        System.out.println(publicationYearMedian);
        assertEquals(1988, publicationYearMedian, 0);
    }
}
