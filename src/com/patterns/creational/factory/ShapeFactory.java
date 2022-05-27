package com.patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class ShapeFactory {
    private static List<Shape> shapes;
   static {
       Shape rectangle = new Rectangle();
       Shape circle = new Circle();
       shapes = new ArrayList<Shape>(){
           {
               add(rectangle);
               add(circle);
           }
       };
   }

    public static Shape getShape(ShapeType type) {
        for(Shape shape : shapes) {
            if(shape.getShapeType() == type) {
                return shape;
            }
        }
        return null;
    }
}
