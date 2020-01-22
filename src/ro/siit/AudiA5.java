package ro.siit;

import java.sql.SQLOutput;

public class AudiA5 extends Audi {

    private float availableFuel;
    private String chassisNumber;
    private float consumption;
    private int tireSize;


    public AudiA5(int availableFuel, String chassisNumber){
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
        if(tireSize>16)
            totalConsumption+=3;
    }


}
