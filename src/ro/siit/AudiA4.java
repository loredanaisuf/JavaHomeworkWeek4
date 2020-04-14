package ro.siit;

public class AudiA4 extends Audi {
    private final int FUEL_TANK_SIZE=50;
    private final float CONSUMPTION_PER_100_KM=4.7f;
    private final int GEAR=5;

    public AudiA4(int availableFuel, String chassisNumber){
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
        return CONSUMPTION_PER_100_KM;
    }



    @Override
    public void setTireSize(int tireSize) {
        this.tireSize=tireSize;
        if(tireSize>17)
            totalConsumption+=4;
    }
}
