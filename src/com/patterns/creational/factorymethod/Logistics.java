package com.patterns.creational.factorymethod;

import java.util.List;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public abstract class Logistics {
    public void planDelivery(List<String> items) {
        Transport transport = createTransport();
        transport.deliver(items);
    }
    public abstract Transport createTransport();
}
