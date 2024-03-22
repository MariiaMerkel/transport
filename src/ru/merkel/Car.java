package ru.merkel;

import java.util.Objects;

public class Car extends Transport{
    private Double engineVolume;

    public Car(String brand, String model, Integer year, String country, String color, int speedMax, Double engineVolume) {
        super(brand, model, year, country, color, speedMax);
        this.engineVolume = engineVolume != null && engineVolume > 0 ? engineVolume : 1.5;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return String.format("Автомобиль %s, мощность двигателя - %.1f.", super.toString(), engineVolume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(engineVolume, car.engineVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume);
    }
}
