package com.patterns.structural.classadapter;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class RoundHole {
    private double radius;
    public RoundHole(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return this.getRadius() >= roundPeg.getRadius();
    }
}
