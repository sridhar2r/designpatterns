package com.patterns.creational.factory;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class ShapeDriver {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.drawShape();
        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.drawShape();

    }
}
