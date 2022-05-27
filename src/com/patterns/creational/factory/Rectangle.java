package com.patterns.creational.factory;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class Rectangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.RECTANGLE;
    }
}
