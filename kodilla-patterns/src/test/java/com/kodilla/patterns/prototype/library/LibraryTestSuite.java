package com.kodilla.patterns.prototype.library;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        // Given
        Library library = new Library("Set of books");

        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2001, 5, 1));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(2002, 3, 6));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.of(2003, 10, 22));
        Book book4 = new Book("Title 4", "Author 4", LocalDate.of(2004, 12, 30));
        Book book5 = new Book("Title 5", "Author 5", LocalDate.of(2005, 7, 3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // When
        library.getBooks().remove(book1);

        // Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }

}
