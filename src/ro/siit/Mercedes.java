package ro.siit;

public abstract class Mercedes extends Car {
    final String FUEL_TYPE="diesel";
    final int FUEL_TANK_SIZE=50;
    final float CONSUMPTION_PER_100_KM=6f;
    final int GEAR=5;
    int currentGear;
    boolean AC;

    public abstract void setSpeed(int speed);

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
    public void start(){
        super.start();
        AC=true;
    }


    @Override
    public float getAverageFuelConsumption() {
        if(AC) {
            return CONSUMPTION_PER_100_KM + 1;
        }else{
            return CONSUMPTION_PER_100_KM;
        }
    }

}
