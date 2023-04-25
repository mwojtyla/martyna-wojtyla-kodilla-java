package com.kodilla.cannoncollection;

public class Cannon {
    private boolean loaded;

    public void fire(boolean loaded){
        if (!loaded) {
            System.out.println("No bullet in the cannon.");
            loaded = true;
        } else {
            System.out.println("The cannon is loaded.");   }

    }

    public boolean getLoaded() {
        return loaded;
    }
}
