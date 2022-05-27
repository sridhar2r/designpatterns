package com.patterns.creational.factorymethod;

import java.util.List;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class Truck implements Transport {
    @Override
    public void deliver(List<String> items) {
        System.out.println("Delivering "+items+" by Truck");
    }
}
