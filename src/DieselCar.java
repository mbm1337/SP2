public class DieselCar extends AFuelCar{
    public final boolean particleFilter;

    public DieselCar(boolean particleFilter,String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre,"Diesel");
        this.particleFilter = particleFilter;
    }


    public boolean hasParticleFilter() {
        return particleFilter;
    }


    @Override
    public String getFuelType(){
        return null;
    }

    @Override
    public int getRegistrationFee() {
        double kmPrLitre = super.getKmPrLitre();
        int registrationFee = 0;
        if (!particleFilter) {
            registrationFee = 1000;
        }

        if ((20 <= kmPrLitre) && (kmPrLitre < 50)) {
            registrationFee += 330 + 130;
        }else if (15<= kmPrLitre) {
            registrationFee += 1050 + 1390;
        }else if (10<= kmPrLitre) {
            registrationFee += 2340 + 1850;
        }else if (5<= kmPrLitre) {
            registrationFee += 5500 + 2770;
        }else {
            registrationFee += 10470 + 15260;
        }

        return registrationFee;
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis car has a particlefilter: " + hasParticleFilter() + "\nRegistration fee: " + getRegistrationFee()+"\n";
    }
}
