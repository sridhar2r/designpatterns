package com.patterns.structural.decorator.logger;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class HeavyLiftLogTracer extends HeavyLiftTracer {
    public HeavyLiftLogTracer(HeavyLiftable heavyLiftable) {
        super(heavyLiftable);
    }
    @Override
    public void doHeavyLifting() {
        Instant instant = Instant.now();
        System.out.println("Heavy Lifting starting at "+ instant);
        heavyLiftable.doHeavyLifting();
        Instant afterLifting = Instant.now();
        Duration duration = Duration.between(instant, afterLifting);
        System.out.println("Total time taken for heavy lifting is " + duration.toMillis()+" milli seconds");
    }
}
