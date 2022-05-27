package com.patterns.creational.factorymethod;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
