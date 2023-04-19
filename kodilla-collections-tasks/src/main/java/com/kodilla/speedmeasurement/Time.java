package com.kodilla.speedmeasurement;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Time {
    public static void main (String[] args) {

    ///// PART 1: LINKEDLIST

        List<Book> theList = new LinkedList<>();
        for (int n=0; n<200000; n++){
            theList.add(new Book("Author", "Title " + n));
        }

        // The time of searching end deleting the object at the beginning
        System.out.println("Size of the List before remove the first element: " + theList.size());
        long begin = System.currentTimeMillis();
        theList.remove(new Book("Author", "Title " + 0));
        long end = System.currentTimeMillis();
        System.out.println("Remove the element at the beginning of the LinkedList has taken: " + (end - begin) + "ns");
        System.out.println("Size of the List after remove the first element: " + theList.size() +"\n");

        // The time of the searching end deleting the object at the end
        System.out.println("Size of the List before remove the last element: " + theList.size());
        long begin1 = System.currentTimeMillis();
        theList.remove(new Book("Author", "Title " + 199999));
        long end1 = System.currentTimeMillis();
        System.out.println("Remove the element at the end of the LinkedList has taken: " + (end1 - begin1) + "ns");
        System.out.println("Size of the List after remove the last element: " + theList.size() +"\n");

        // The time of the insertion the object at the beginning
        System.out.println("Size of the List before add the first element: " + theList.size());
        long begin2 = System.currentTimeMillis();
        theList.add(0, new Book("Erich Segal", "Doctors"));
        long end2 = System.currentTimeMillis();
        System.out.println("Add the element at the beginning of the LinkedList has taken: " + (end2 - begin2) + "ns");
        System.out.println("Size of the List after remove the first element: " + theList.size() +"\n");

        // The time of the insertion the object at the end
        System.out.println("Size of the List before add the last element: " + theList.size());
        long begin3 = System.currentTimeMillis();
        theList.add(theList.size()-1, new Book("Erich Segal", "Doctors"));
        long end3 = System.currentTimeMillis();

        System.out.println("Add the element at the end of the LinkedList has taken: " + (end3 - begin3) + "ns");
        System.out.println("Size of the List after remove the last element: " + theList.size() +"\n");


    //// PART 2: HASHMAP


        //    STRING IS THE KEY
        //    Map <String, Book> bookMap = new HashMap<>();
        //    for(int i=0; i<100000; i++){
        //    bookMap.put(String.valueOf(i), new Book("Author", "Title " + i));
        //}


        // BOOK IS THE KEY
        Map<Book, String> bookMap = new HashMap<>();
        for(int i=0; i<100000; i++){
            bookMap.put(new Book("Author", "Title " + i), String.valueOf(i));
        }


        // The time of the search by key
        long begin4 = System.currentTimeMillis();

        // STRIN IS THE KEY
        //for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
        //        entry.getKey();
        //        entry.getValue();
        //}

        // BOOK IS THE KEY
        for (Map.Entry<Book, String> entry : bookMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        long end4 = System.currentTimeMillis();
        System.out.println("Get the elements from the Map has taken: " + (end4 - begin4) + "ns" + "\n");

        // The time of adding the object to map
        System.out.println("Size of the Map before add the element: " + bookMap.size());
        long begin5 = System.currentTimeMillis();
        bookMap.put(new Book("Author", "Title"), String.valueOf(100001));
        long end5 = System.currentTimeMillis();
        System.out.println("Add the element to the Map has taken: " + (end5 - begin5) + "ns");
        System.out.println("Size of the Map after add the element: " + bookMap.size() + "\n");
        // The time of deleting the object from map
        System.out.println("Size of the Map before remove the element: " + bookMap.size());
        long begin6 = System.currentTimeMillis();
        bookMap.remove(new Book("Author", "Title"));
        long end6 = System.currentTimeMillis();
        System.out.println("Remove the element from the Map has taken: " + (end6 - begin6) + "ns");
        System.out.println("Size of the Map after remove the element: " + bookMap.size());

    }
}
