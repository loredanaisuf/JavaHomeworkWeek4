package ro.siit;

import java.sql.SQLOutput;

public class AudiA5 extends Audi {
    private final double CONSUMPTION_PER_100_KM=6.0;
    private final int GEAR=6;
    private double availableFuel;
    private String chassisNumber;
    private double consumption;


    public AudiA5(int availableFuel, String chassisNumber){
        this.availableFuel=availableFuel;
        this.chassisNumber=chassisNumber;
        totalConsumption=0;
    }



    public void drive(double n){
        consumption=n*0.01*CONSUMPTION_PER_100_KM;
        totalConsumption+=consumption;
    }

    @Override
    public double getAvailableFuel() {
        return this.availableFuel-totalConsumption;
    }

    public void shiftGear(int gear){
        if(gear>GEAR){
            System.out.println("This car doesn't have this gear");
        }
    }

    public double getAverageFuelConsumption(){
        return CONSUMPTION_PER_100_KM;
    }



}
