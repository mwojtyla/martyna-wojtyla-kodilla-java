package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, BookB> booksMap = new HashMap<>();
        for(Book theBook: bookSet){
            booksMap.put(new BookSignature(theBook.getSignature()), new BookB(theBook.getAuthor(), theBook.getTitle(), theBook.getPublicationYear()));
        }
        return medianPublicationYear(booksMap);

    }
}
