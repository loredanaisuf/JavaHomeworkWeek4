package ro.siit;

public class AudiA4 extends Audi {

    private float availableFuel;
    private String chassisNumber;
    private float consumption;
    private int tireSize;

    public AudiA4(int availableFuel, String chassisNumber){
        this.availableFuel=availableFuel;
        this.chassisNumber=chassisNumber;
        totalConsumption=0;
    }

    @Override
    public float getAvailableFuel() {
        return this.availableFuel-totalConsumption;
    }


    @Override
    public void setTireSize(int tireSize) {
        this.tireSize=tireSize;
        if(tireSize>17)
            totalConsumption+=4;
    }
}
