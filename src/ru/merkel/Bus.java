package ru.merkel;

public class Bus extends Transport{

    public Bus(String brand, String model, Integer year, String country, String color, Integer speedMax) {
        super(brand, model, year, country, color, speedMax);
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString() + '.';
    }
}
