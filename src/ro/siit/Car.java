package ro.siit;

public abstract class Car implements Vehicle {
    private String chassisNumber;
    protected float totalConsumption;
    protected float consumption;
    protected float availableFuel;
    protected int tireSize;
    protected int currentGear;

    public Car(int availableFuel, String chassisNumber){
        this.availableFuel=availableFuel;
        this.chassisNumber=chassisNumber;
        totalConsumption=0;
    }

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
