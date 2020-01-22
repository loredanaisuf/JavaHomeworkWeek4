package ro.siit;

public abstract class Car implements Vehicle {
    protected float totalConsumption;
    protected float consumption;

    public abstract void shiftGear(int gear);
    public abstract float getAverageFuelConsumption();
    public abstract float getAvailableFuel();


    @Override
    public void start(){
        totalConsumption=0;
        System.out.println("The car was started");
    }

    @Override
    public void stop() {
        System.out.println("The car was stopped!");
    }




}
