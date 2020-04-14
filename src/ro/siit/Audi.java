package ro.siit;

public abstract class Audi extends Car {

    public Audi(int availableFuel, String chassisNumber){
        super(availableFuel, chassisNumber);
    }
    public abstract void setTireSize(int tireSize);

    @Override
    public float getAvailableFuel() {
        return this.availableFuel-totalConsumption;
    }

}
