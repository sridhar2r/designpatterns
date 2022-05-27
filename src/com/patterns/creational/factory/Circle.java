package com.patterns.creational.factory;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class Circle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Circle");
    }

    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }
}
