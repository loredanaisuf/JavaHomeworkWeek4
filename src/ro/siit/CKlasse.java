package ro.siit;

public class CKlasse extends Mercedes {
    private float availableFuel;
    private String chassisNumber;
    private float consumption;
    private int speed;

    public CKlasse(int availableFuel, String chassisNumber){
        this.availableFuel=availableFuel;
        this.chassisNumber=chassisNumber;
        totalConsumption=0;
    }

    @Override
    public float getAvailableFuel() {
        if(AC) {
            return this.availableFuel - totalConsumption - 4;
        }else {
            return this.availableFuel - totalConsumption;
        }
    }

    public void getTotalConsumption(){
        System.out.println("total consum: "+totalConsumption);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed=speed;
        if(speed>100)
            this.totalConsumption= (float) (1.2*this.totalConsumption);
    }
}
