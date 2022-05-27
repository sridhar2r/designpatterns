package com.patterns.structural.decorator.logger;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public abstract class HeavyLiftTracer implements HeavyLiftable {
    protected HeavyLiftable heavyLiftable;
    public HeavyLiftTracer(HeavyLiftable heavyLiftable) {
        this.heavyLiftable = heavyLiftable;
    }
    @Override
    public void doHeavyLifting() {
        heavyLiftable.doHeavyLifting();
    }
}
