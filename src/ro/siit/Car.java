package ro.siit;

public abstract class Car implements Vehicle {

    protected double totalConsumption;

    public abstract double getAvailableFuel();
    public abstract void shiftGear(int gear);
    public abstract double getAverageFuelConsumption();

    @Override
    public void stop() {
        System.out.println("The car was stopped!");
    }

    public void start(){
        totalConsumption=0;
        System.out.println("The car was started");
    }

}
