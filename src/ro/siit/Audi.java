package ro.siit;

public abstract class Audi extends Car {
    final int FUEL_TANK_SIZE=60;
    final float CONSUMPTION_PER_100_KM=4.7f;
    final int GEAR=5;
    int currentGear;

    public abstract void setTireSize(int tireSize);

    @Override
    public void drive(float n) {
        consumption= (float) (n*0.01*CONSUMPTION_PER_100_KM);
        totalConsumption+=consumption;
    }

    @Override
    public void shiftGear(int gear) {
        if(gear>GEAR){
            System.out.println("This car doesn't have this gear");
        }
        currentGear=gear;
    }

    @Override
    public float getAverageFuelConsumption() {
        return CONSUMPTION_PER_100_KM;
    }



}
