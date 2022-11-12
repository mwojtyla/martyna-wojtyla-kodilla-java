package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
        }

    public Shape getFigure(int n){
        Shape theShape = null;
        if (n >=0 && n < shapes.size()) {
            theShape = shapes.get(n);
        }
        return theShape;
    }


    public String showFigures() {
        String figureNames = "";
        for (Shape element: shapes) {
        figureNames = figureNames + element.getShapeName() +  ", " ;
        }
        return figureNames.substring(0,(figureNames.length()-2));
    }

    public int getSize(){
        return shapes.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return shapes.equals(that.shapes);
    }

    @Override
    public int hashCode() {
        return shapes.hashCode();
    }
}
