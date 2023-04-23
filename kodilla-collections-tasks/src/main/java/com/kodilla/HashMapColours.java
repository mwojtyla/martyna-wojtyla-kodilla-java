package com.kodilla;

import java.util.HashMap;
import java.util.Map;

public class HashMapColours {
    public static void main (String[] args) {
        Map<Integer,String> myFavoriteColours = new HashMap<>();
        Map<Integer,String> myFriendsFavoriteColours = new HashMap<>();

        myFavoriteColours.put(1, "Red");
        myFavoriteColours.put(2, "Green");
        myFavoriteColours.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColours);

        myFriendsFavoriteColours.put(4, "White");
        myFriendsFavoriteColours.put(5, "Blue");
        myFriendsFavoriteColours.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColours);

        Map<Integer,String> ourFavoriteColours = new HashMap<>();
        for (Map.Entry<Integer,String> entry: myFavoriteColours.entrySet()) {
            ourFavoriteColours.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer,String> entry: myFriendsFavoriteColours.entrySet()) {
            ourFavoriteColours.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Values in new map: " + ourFavoriteColours);

    }
}
