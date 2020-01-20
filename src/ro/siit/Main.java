package ro.siit;

public class Main {

    public static void main(String[] args) {
	Car car=new AudiA5(50,"jfdkfdlfjvdf");
        car.start();

        car.shiftGear(1);

        car.drive(0.01);// drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

        double availableFuel = car.getAvailableFuel();
        System.out.println("The fuel available is: " + availableFuel);

        double fuelConsumedPer100Km = car.getAverageFuelConsumption();
        System.out.println("The fuel consumed per 100 km is: " + fuelConsumedPer100Km);

        Vehicle vehicle=new AudiA5(30,"CNJFDDFHL");
        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car car2 = (Car) vehicle;

        availableFuel = car2.getAvailableFuel();
        System.out.println("The fuel available is: " + availableFuel);

        fuelConsumedPer100Km = car2.getAverageFuelConsumption();
        System.out.println("The fuel consumed per 100 km is: " + fuelConsumedPer100Km);
    }
}
