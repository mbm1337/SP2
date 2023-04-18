public class ElectricCar extends ACar{

    private final int batteryCapacityKWh;
    private final int maxRangeKm;

    public ElectricCar(int batteryCapacityKWh, int maxRangeKm, String  registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacityKWh;

    }
    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public int getKWhPrKm(){

        return maxRangeKm/batteryCapacityKWh;

    }


    @Override
    public int getRegistrationFee() {
       double kmPrLit = Math.floor(100/(getKWhPrKm()/91.25));
        int registrationFee;
        if (20 <= kmPrLit) {
            registrationFee = 330;
        }else if (15<= kmPrLit) {
            registrationFee = 1050;
        }else if (10<= kmPrLit) {
            registrationFee = 2340;
        }else if (5<= kmPrLit) {
            registrationFee = 5500;
        }else {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString(){
        return super.toString() + "\nBattery capacity: " + batteryCapacityKWh + "\nMax range: " + maxRangeKm + "\nkWh/Km: " + getKWhPrKm() + "\nRegistration fee: " + getRegistrationFee()+"\n";

    }


}
