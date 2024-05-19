package org.example;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Начало работы приложения");
        Car.manufacture("Toyota Camry");
        CarDealer carDealer = new CarDealer();
        carDealer.sell("Toyota Camry", 50);
        carDealer.calculateMaintenanceCost("Toyota Camry");

        Car toyotaCamry = new Car("Toyota Camry");
        toyotaCamry.setModelName("Toyota Camry");
        toyotaCamry.drive();
        toyotaCamry.repair();
        toyotaCamry.refuel();

        Car.manufactureCustom("Custom Model");
        carDealer.lease("Custom Model", 5);
        carDealer.lease(true);
        toyotaCamry.Rawr();
        logger.info("Конец работы приложения");
    }
}

class Car extends Ferrari {
    private static final Logger logger = Logger.getLogger(Car.class);

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private String modelName;

    public void drive() { logger.info("Поездка на автомобиле: " + modelName); }

    public void repair() { logger.info("Ремонт автомобиля: " + modelName); }

    public void refuel() { logger.info("Заправка автомобиля: " + modelName); }

    public static void manufacture(String modelName) { logger.info("Производство автомобиля: " + modelName); }

    public static void manufactureCustom(String modelName) { logger.info("Производство индивидуального автомобиля: " + modelName); }

    @Override
    public void Rawr() { logger.info("RrrrrrrrrrrrrrRRoROROROrorr"); }
}

abstract class Ferrari {
    public abstract void Rawr();
}

class CarDealer {
    private static final Logger logger = Logger.getLogger(CarDealer.class);

    public void sell(String modelName, int quantity) {
        logger.info("Продажа автомобиля: " + modelName + ", количество: " + quantity);
    }

    public void lease(String modelName, int quantity) {
        logger.info("Аренда автомобиля: " + modelName + ", количество: " + quantity);
    }

    public void lease(boolean A) {
        if (A) {
            logger.info("Аренда прошла успешно!");
        } else {
            logger.info("Аренда прошла неудачно(");
        }
    }

    public void calculateMaintenanceCost(String modelName) {
        logger.info("Расчет затрат на обслуживание автомобиля: " + modelName);
    }
}