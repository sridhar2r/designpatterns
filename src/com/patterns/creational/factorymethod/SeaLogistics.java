package com.patterns.creational.factorymethod;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
