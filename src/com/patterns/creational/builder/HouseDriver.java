package com.patterns.creational.builder;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class HouseDriver {
    public static void main(String[] args) {
        House house = House.builder()
                .basement("first basement")
                .interior("first interior")
                .roof("first roof")
                .structure("first structure")
                .build();
        House house1 = House.builder().build();
        System.out.println(house);
        System.out.println(house1);
    }
}
