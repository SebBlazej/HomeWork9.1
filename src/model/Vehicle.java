package model;

import static etc.QuickMath.*;

public class Vehicle {

    private double fuelUsage;
    private static final int PER_HOW_MANY_KM_FUEL_USAGE = 100;

    private String name;
    private double tankSize;

    Vehicle(String name, double fuelUsage, double tankSize) {
        this.name = name;
        this.fuelUsage = fuelUsage;
        this.tankSize = tankSize;
    }

    public void printInfo() {
        System.out.println("\nTyp - " + getClassName());
        System.out.println("Nazwa - " + name);
        System.out.printf("Zużycie paliwa - %.2f/100km ", fuelUsage);
        System.out.printf("| Rozmiar baku - %.2f litrow", tankSize);
        System.out.printf("\nZasięg pojazdu wynosi - %.2fkm\n", getRange());
    }

    String getClassName() {
        return "Vehicle";
    }

    private double getRange() {
            return findNumberDividorByProportions(fuelUsage, PER_HOW_MANY_KM_FUEL_USAGE, tankSize);
    }

    void increaseFuelUsage(double howMuchIncrease) {
        this.fuelUsage += howMuchIncrease;
    }

    void decreaseFuelUsage(double howMuchDecrease) {
        this.fuelUsage -= howMuchDecrease;
    }
}
