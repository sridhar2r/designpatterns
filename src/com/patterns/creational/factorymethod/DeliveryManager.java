package com.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class DeliveryManager {
    public static void main(String[] args) {
        List<String> items = new ArrayList<String>() {
            {
                add("Chips");
                add("Fruits");
                add("Rice");
                add("Wheat");
            }
        };
        Logistics logistics = LogisticsMaker.getLogistics();
        logistics.planDelivery(items);
    }
}
