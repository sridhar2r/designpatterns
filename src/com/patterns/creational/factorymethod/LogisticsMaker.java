package com.patterns.creational.factorymethod;

import java.time.LocalTime;

/**
 *
 * This is not suggested in any place. Felt it is better to have this logic separated from
 * main application #DeliveryManager so if new Logistics comes in main method is not touched
 * Naming this class as LogisticsMaker, so getLogistics method is not confused with factory method
 * pattern method
 * Created by sridharrajagopal on 5/27/22.
 */
public class LogisticsMaker {
    public static Logistics getLogistics() {
        Logistics logistics;
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime now = LocalTime.now();
        if(now.equals(midnight)) {
            logistics = new RoadLogistics();
        } else {
            logistics = new SeaLogistics();
        }
        return logistics;
    }
}
