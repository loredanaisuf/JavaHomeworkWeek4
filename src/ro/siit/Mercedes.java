package ro.siit;

public abstract class Mercedes extends Car {
    boolean AC;

    public Mercedes(int availableFuel, String chassisNumber){
        super(availableFuel,chassisNumber);
    }

    public abstract void setSpeed(int speed);

    @Override
    public float getAvailableFuel() {
        if(AC) {
            return this.availableFuel - totalConsumption - 2;
        }else {
            return this.availableFuel - totalConsumption;
        }
    }
    @Override
    public void start(){
        super.start();
        AC=true;
    }

}
