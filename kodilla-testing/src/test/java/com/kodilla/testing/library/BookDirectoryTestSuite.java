package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }


    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testlistBooksInHandsOfNoBooks() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        LibraryUser user1 = new LibraryUser("Jan", "Kowalski", "00121212365");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOf0Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(user1);

        // Then
        assertEquals(0, theListOfBooks0.size());

    }
    @Test
    void testlistBooksInHandsOfOneBook() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0neBook = new ArrayList<>();
        Book book1 = new Book("Doctors", "Erich Segal", 1988);
        resultListOf0neBook.add(book1);
        LibraryUser user1 = new LibraryUser("Jan", "Kowalski", "00121212365");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOf0neBook);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user1);

        // Then
        assertEquals(1, theListOfBooks.size());

    }
    @Test
    void testlistBooksInHandsOfFiveBooks() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfFiveBooks = new ArrayList<>();
        Book book1 = new Book("Doctors", "Erich Segal", 1988);
        Book book2 = new Book("Love Story", "Erich Segal", 1970);
        Book book3 = new Book("Dear John", "Nicholas Sparks", 2006);
        Book book4 = new Book("The Notebook", "Nicholas Sparks", 1996);
        Book book5 = new Book("The Lucky One", "Nicholas Sparks", 2008);
        resultListOfFiveBooks.add(book1);
        resultListOfFiveBooks.add(book2);
        resultListOfFiveBooks.add(book3);
        resultListOfFiveBooks.add(book4);
        resultListOfFiveBooks.add(book5);
        LibraryUser user1 = new LibraryUser("Jan", "Kowalski", "00121212365");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOfFiveBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user1);

        // Then
        assertEquals(5, theListOfBooks.size());
    }
}
