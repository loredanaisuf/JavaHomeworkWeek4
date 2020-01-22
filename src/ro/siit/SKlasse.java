package ro.siit;

public class SKlasse extends Mercedes{
    private float availableFuel;
    private String chassisNumber;
    private float consumption;
    private int speed;

    public SKlasse(int availableFuel, String chassisNumber){
        this.availableFuel=availableFuel;
        this.chassisNumber=chassisNumber;
        totalConsumption=0;
    }

    @Override
    public float getAvailableFuel() {
        if(AC) {
            return this.availableFuel - totalConsumption - 2;
        }else {
            return this.availableFuel - totalConsumption;
        }
    }

    @Override
    public void setSpeed(int speed) {
        this.speed=speed;
        if(speed<80)
            totalConsumption*=0.1*totalConsumption;
    }
}
