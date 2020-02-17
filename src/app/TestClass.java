package app;

import model.Car;
import model.Truck;
import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = createVehicleList();
        testVehicles(vehicleList);

    }

    private static List<Vehicle> createVehicleList(){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("Car 1", 10, 100, false));
        vehicleList.add(new Car("Car 2", 100, 100.9, false));
        vehicleList.add(new Truck("Truck 1", 10.11, 100.67, false, 100));
        vehicleList.add(new Truck("Truck 2", 10.979, 126.8887, false, 650));
        vehicleList.add(new Truck("Truck 3", 17, 1234, false, 23));
        return vehicleList;
    }

    private static void testVehicles(List<Vehicle> vehicleList){
        for(Vehicle vehicle: vehicleList){
            System.out.println("\n-------------STAN POCZĄTKOWY-------------");
            vehicle.printInfo();
            System.out.println("\nWŁĄCZENIE KLIMATYZACJI");
            if(vehicle instanceof Car) ((Car) vehicle).turnOnAirConditioner();
            vehicle.printInfo();
            System.out.println("\nWYŁĄCZENIE KLIMATYZACJI");
            if(vehicle instanceof Car) ((Car) vehicle).turnOffAirConditioner();
            vehicle.printInfo();
            System.out.println("\n-------------KONIEC TESTU POJAZDU-------------");
        }
    }
}
