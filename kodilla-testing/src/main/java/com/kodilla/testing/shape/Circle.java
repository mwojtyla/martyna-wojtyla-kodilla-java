package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName(){
        return "Circle";
    }

    public double getField(int r, int d) {
        return 3.14*r*r;
    }
}
