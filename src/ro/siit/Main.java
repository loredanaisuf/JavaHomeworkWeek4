package ro.siit;

public class Main {

    public static void main(String[] args) {
        System.out.println("........Car1.......");
	    Car car=new AudiA5(50,"jfdkfdlfjvdf");
        car.start();

        car.shiftGear(1);

        car.drive(0.01f);// drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02f);

        car.shiftGear(3);

        car.drive(0.5f);

        car.shiftGear(4);

        car.drive(0.5f);

        car.shiftGear(4);

        car.drive(0.5f);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5f);

        car.shiftGear(3);

        car.drive(0.1f);

        car.stop();

        float availableFuel = car.getAvailableFuel();
        System.out.println("The fuel available is: " + availableFuel);

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();
        System.out.println("The fuel consumed per 100 km is: " + fuelConsumedPer100Km);


        System.out.println("........Car2.......");

        Vehicle vehicle=new CKlasse(30,"CNJFDDFHL");
        vehicle.start();

        vehicle.drive(100);

        vehicle.stop();

        Car car2 = (Car) vehicle;

        availableFuel = car2.getAvailableFuel();
        System.out.println("The fuel available is: " + availableFuel);

        fuelConsumedPer100Km = car2.getAverageFuelConsumption();
        System.out.println("The fuel consumed per 100 km is: " + fuelConsumedPer100Km);

        CKlasse ck=(CKlasse) car2;
        ck.getTotalConsumption();
        ck.setSpeed(120);
        availableFuel=ck.getAvailableFuel();
        ck.getTotalConsumption();
        System.out.println("The fuel available if the speed is increased: " + availableFuel);


        System.out.println("........Car3.......");

        Car car3=new AudiA4(40,"fdfdjnkfjnvf");
        car3.start();
        car3.drive(30);
        car3.drive(100);
        car3.stop();
        availableFuel = car3.getAvailableFuel();
        System.out.println("The fuel available is: " + availableFuel);

        fuelConsumedPer100Km = car3.getAverageFuelConsumption();
        System.out.println("The fuel consumed per 100 km is: " + fuelConsumedPer100Km);
        AudiA4 a4=(AudiA4) car3;
        a4.setTireSize(19);
        availableFuel=a4.getAvailableFuel();
        System.out.println("The fuel available if the tires are changed: " + availableFuel);


        System.out.println("........Car4.......");

        Vehicle vehicle1=new SKlasse(20,"CNJFDDFHL");
        vehicle1.start();

        vehicle1.drive(200);

        vehicle1.stop();

        Car car4 = (Car) vehicle1;

        availableFuel = car4.getAvailableFuel();
        System.out.println("The fuel available is: " + availableFuel);

        fuelConsumedPer100Km = car4.getAverageFuelConsumption();
        System.out.println("The fuel consumed per 100 km is: " + fuelConsumedPer100Km);

        SKlasse sk=(SKlasse) car4;
        sk.setSpeed(20);
        availableFuel=sk.getAvailableFuel();
        System.out.println("The fuel available if the speed is decreased: " + availableFuel);
    }
}
