package ru.merkel;

import java.util.Objects;

public class Transport {
    private final String brand;
    private final String model;
    private final Integer year;
    private final String country;
    private String color;
    private Integer speedMax;

    public Transport(String brand, String model, Integer year, String country, String color, Integer speedMax) {
        this.brand = (brand != null && !brand.isEmpty() && !brand.isBlank()) ? brand : "default brand";
        this.model = (model != null && !model.isEmpty() && !model.isBlank()) ? model : "default model";
        this.year = (year != null && year > 0) ? year : 2000;
        this.country = (country != null && !country.isEmpty() && !country.isBlank()) ? country : "default country";
        this.color = (color != null && !color.isEmpty() && !color.isBlank()) ? color : "белый";
        this.speedMax = (speedMax != null && speedMax > 0) ? speedMax : 120;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color != null && !color.isEmpty() && !color.isBlank()) ? color : "белый";
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax > 0 ? speedMax : 120;
    }

    @Override
    public String toString() {
        return String.format("марки - %s, модели - %s, год выпуска - %d, страна производитель - %s, цвет кузова - %s, максимальная скорость - %d км/ч", brand, model, year, country, color, speedMax);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport transport)) return false;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(year, transport.year) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color) && Objects.equals(speedMax, transport.speedMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, speedMax);
    }
}
