package com.patterns.structural.classadapter;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth()/2), 2)) * 2;
    }
}
