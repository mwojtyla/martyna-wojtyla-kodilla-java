package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {

    private final List<String> books = new ArrayList<>();

    // Wstrzykiwanie zależności do właściwości klasy
    @Autowired
    private LibraryDbController libraryDbController;

    // wstrzykiwanie zależności przez konstruktor
    /*@Autowired
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library(){
        // do nothing
    }*/

    // Wstrzykiwanie zależności przy pomocy metody
    /*@Autowired
    public void setLibraryDbController(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }*/

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
