package com.kodilla.cannoncollection;

import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main (String[] args) {
        // Part 1:
        boolean loaded = false;
        Cannon cannon = new Cannon();
        cannon.fire(loaded);

        // Part 2:
        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        Cannon cannon3 = new Cannon();
        Cannon cannon4 = new Cannon();
        Cannon cannon5 = new Cannon();

        List<Cannon> cannonList = new LinkedList<>();
        cannonList.add(cannon1);
        cannonList.add(cannon2);
        cannonList.add(cannon3);
        cannonList.add(cannon4);
        cannonList.add(cannon5);


        for (Cannon cannons: cannonList){
            boolean loaded2 = true;
            cannons.fire(loaded2);
        }


    }
}
