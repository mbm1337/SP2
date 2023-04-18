public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre, "Gasoline");
    }

    @Override
    public int getRegistrationFee() {
        double kmPrLitre = super.getKmPrLitre();
        int registrationFee;

        if ((20 <= kmPrLitre) && (kmPrLitre < 50)) {
            registrationFee = 330;
        }else if (15<= kmPrLitre) {
            registrationFee = 1050;
        }else if (10<= kmPrLitre) {
            registrationFee = 2340;
        }else if (5<= kmPrLitre) {
            registrationFee = 5500;
        }else {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String getFuelType(){
        return super.getFuelType();

    }

    @Override
    public String toString(){
        return super.toString() + "\nRegistration fee: " + getRegistrationFee() +"\n";
    }
}
