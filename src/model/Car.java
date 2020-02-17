package model;

public class Car extends Vehicle {

    private static final double FUEL_USAGE_INCREASE_VALUE_IF_AC_IS_ON = 0.8;

    private boolean airConditionerIsOn = false;

    public Car(String name, double fuelUsage, double tankSize, boolean airConditionerIsOn) {
        super(name, fuelUsage, tankSize);
        if(airConditionerIsOn) turnOnAirConditioner();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Klimatyzacja jest - " + ((airConditionerIsOn)?"włączona":"wyłączona"));
    }

    @Override
    String getClassName(){
        return "Car";
    }


    public void turnOnAirConditioner(){
        if(!airConditionerIsOn) {
            super.increaseFuelUsage(getFuelUsageIncreaseIfAirConditionerIsOn());
            this.airConditionerIsOn = true;
        }
    }

    public void turnOffAirConditioner(){
        if(airConditionerIsOn) {
            super.decreaseFuelUsage(getFuelUsageIncreaseIfAirConditionerIsOn());
            this.airConditionerIsOn = false;
        }
    }

    double getFuelUsageIncreaseIfAirConditionerIsOn(){
        return Car.FUEL_USAGE_INCREASE_VALUE_IF_AC_IS_ON;
    }

}
