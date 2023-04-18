public abstract class AFuelCar extends ACar {

    private final double kmPrLitre;
    private final String fuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre, String fuelType) {
        super(registrationNumber, make, model, numberOfDoors);
        this.fuelType = fuelType;
        this.kmPrLitre = kmPrLitre;
    }

    public String getFuelType(){
        return fuelType;
    }

    double getKmPrLitre(){
        return kmPrLitre;

    }

    @Override
    public String toString(){

        return super.toString() + "\nFuel type: " + fuelType + "\nKm/L: " + kmPrLitre;

    }

}
