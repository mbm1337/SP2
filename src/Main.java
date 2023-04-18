public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        Car carGas1 = new GasolineCar("AS34118","Volvo","940",4, 10.1);
        Car carGas2 = new GasolineCar("CB96125","Mazda","3",5,14.5);
        Car carGas3 = new GasolineCar("AA12345", "Mercedes","G65", 5,5.9);

        Car carDiesel1 = new DieselCar(false,"BB12345","Dodge","RAM",2,6.3);
        Car carDiesel2 = new DieselCar(true,"CC12345","Peugeot", "308", 5,32.3);

        Car carElectric1 = new ElectricCar(71,432,"DD12345","Porsche","Taycan",4);
        Car carElectric2 = new ElectricCar(90,465,"EE12345","Hongqi","E-HS9",5);


        fleet.addCar(carGas1);
        fleet.addCar(carGas2);
        fleet.addCar(carGas3);
        fleet.addCar(carDiesel1);
        fleet.addCar(carDiesel2);
        fleet.addCar(carElectric1);
        fleet.addCar(carElectric2);

        System.out.println(fleet);

    }
}