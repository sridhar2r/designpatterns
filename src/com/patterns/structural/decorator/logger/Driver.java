package com.patterns.structural.decorator.logger;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class Driver {
    public static void main(String[] args) {
        HeavyLiftable heavyLiftable = new HeavyLiftLogTracer(new HeavyLifter());
        heavyLiftable.doHeavyLifting();
    }
}
