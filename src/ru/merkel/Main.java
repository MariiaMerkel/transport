package ru.merkel;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.*;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class.getName());

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Lada", "Granta", 2015, "Россия", "жёлтый", 150, 3.4));
        carList.add(new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "чёрный", 200, 4.0));
        carList.add(new Car("BMW", "Z8", 2021, "Германия", "чёрный", 160, 4.4));
        carList.add(new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 180, 3.4));
        carList.add(new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 180,  3.5));
        carList.add(new Car(null, null, null, null, null,0,  null));

        List<Bus> busList = new ArrayList<>();
        busList.add(new Bus("Пазик", "Большой", 1999, "Россия", "Серый", 50));

        carList.forEach(System.out::println);
        busList.forEach(System.out::println);
//        carList.forEach(c -> logger.log(SEVERE, c.toString()));
//        carList.forEach(c -> logger.info(c.toString()));
    }
}