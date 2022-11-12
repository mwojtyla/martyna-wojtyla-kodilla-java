package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String getShapeName(){
        return "Triangle";
    }
    public double getField(int a, int h) {
        return 0.5*a*h;
    }
}
