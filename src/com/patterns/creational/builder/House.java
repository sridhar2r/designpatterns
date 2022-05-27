package com.patterns.creational.builder;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class House {
    private String basement;
    private String structure;
    private String roof;
    private String interior;

    private House() {

    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    static class HouseBuilder {
        private House house;

        public HouseBuilder() {
            this.house = new House();
        }

        public HouseBuilder basement(String basement) {
            house.basement = basement;
            return this;
        }


        public HouseBuilder structure(String structure) {
            house.structure = structure;
            return this;
        }

        public HouseBuilder roof(String roof) {
            house.roof = roof;
            return this;
        }

        public HouseBuilder interior(String interior) {
            house.interior = interior;
            return this;
        }

        public House build() {
            return house;
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "basement='" + basement + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}


