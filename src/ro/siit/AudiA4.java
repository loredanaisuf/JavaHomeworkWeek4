package ro.siit;

public class AudiA4 extends Audi {
    private final double CONSUMPTION_PER_100_KM=4.7;
    private final int GEAR=5;
    private double availableFuel;
    private String chassisNumber;
    private double consumption;
    private double totalConsumption;

    public AudiA4(int availableFuel, String chassisNumber){
        this.availableFuel=availableFuel;
        this.chassisNumber=chassisNumber;
        totalConsumption=0;
    }


    @Override
    public double getAvailableFuel() {
        return this.availableFuel-totalConsumption;
    }

    @Override
    public void shiftGear(int gear) {
        if(gear>GEAR){
            System.out.println("This car doesn't have this gear");
        }
    }

    @Override
    public double getAverageFuelConsumption() {
        return CONSUMPTION_PER_100_KM;
    }


    @Override
    public void drive(double n) {
        consumption=n*0.01*CONSUMPTION_PER_100_KM;
        totalConsumption+=consumption;
    }
}
