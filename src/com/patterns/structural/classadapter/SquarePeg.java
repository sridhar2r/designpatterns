package com.patterns.structural.classadapter;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class SquarePeg {
    private double width;
    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(width, 2);
    }
}
