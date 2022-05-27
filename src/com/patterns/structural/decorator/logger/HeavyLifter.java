package com.patterns.structural.decorator.logger;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class HeavyLifter implements HeavyLiftable {
    @Override
    public void doHeavyLifting() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
