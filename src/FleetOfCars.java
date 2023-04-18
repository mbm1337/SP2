import java.util.ArrayList;

public class FleetOfCars {
    private final ArrayList<Car> fleet = new ArrayList<>();

    public FleetOfCars() {

    }

    void addCar(Car car){
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet() {
        int result = 0;
        for (Car c : fleet) {
            result += c.getRegistrationFee();
        }
        return result;
    }

    @Override
    public String toString(){
        return "Fleet of cars:\n" + fleet +"\nTotal registration fee for fleet: " + getTotalRegistrationFeeForFleet() ;
    }
}
