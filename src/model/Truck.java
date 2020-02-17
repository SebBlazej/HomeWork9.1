package model;

import static etc.QuickMath.*;

public class Truck extends Car {

    private static final double FUEL_USAGE_INCREASE_VALUE_IF_AC_IS_ON = 1.6;

    private static final double FUEL_USAGE_INCREASE_BY_CARGO = 0.5;
    private static final int PER_HOW_MANY_KG_FUEL_USAGE_INCREASE = 100;
    private double cargoWeightInKg = 0;

    public Truck(String name, double fuelUsage, double tankSize, boolean airConditionerIsOn, double cargoWeightInKg) {
        super(name, fuelUsage, tankSize, airConditionerIsOn);
        if (isPositive(cargoWeightInKg)) {
            this.cargoWeightInKg = cargoWeightInKg;
            increaseFuelUsageByCargo();
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Waga ładunku wynosi - %.2fkg\n", this.cargoWeightInKg);
    }

    @Override
    String getClassName() {
        return "Truck";
    }

    @Override
    double getFuelUsageIncreaseIfAirConditionerIsOn(){
        return Truck.FUEL_USAGE_INCREASE_VALUE_IF_AC_IS_ON;
    }

    private void increaseFuelUsageByCargo() {
        super.increaseFuelUsage(divWithoutDecimal(cargoWeightInKg, PER_HOW_MANY_KG_FUEL_USAGE_INCREASE) * FUEL_USAGE_INCREASE_BY_CARGO);
    }

}
