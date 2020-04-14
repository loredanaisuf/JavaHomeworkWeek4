package ro.siit;

public class SKlasse extends Mercedes{
    private final int FUEL_TANK_SIZE=70;
    private final float CONSUMPTION_PER_100_KM=5f;
    private final int GEAR=6;


    public SKlasse(int availableFuel, String chassisNumber){
        super(availableFuel,chassisNumber);
    }

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
        if(AC) {
            return CONSUMPTION_PER_100_KM + 1;
        }else{
            return CONSUMPTION_PER_100_KM;
        }
    }


    @Override
    public void setSpeed(int speed) {
        if(speed<80)
            totalConsumption= (float) (0.8*totalConsumption);
    }
}
