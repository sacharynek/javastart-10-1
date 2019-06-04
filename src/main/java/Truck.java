public class Truck extends Car {

    private double carriage;
    private double carriageFuelFactor;


    public Truck() {
    }


    public Truck(String name, int tankCapacity, double fuelConsumption, boolean isAirConditioningOn, double carriage) {
        super(name, tankCapacity, fuelConsumption, isAirConditioningOn);
        this.carriage = carriage;
        setAirCondFuelFactor(1.6);
        setCarriageFuelFactor(0.5);
    }

    public double getCarriage() {
        return carriage;
    }

    public double getCarriageInQuintal() {
        return getCarriage() / 100;
    }

    public void setCarriage(double carriage) {
        this.carriage = carriage;
    }

    public double getCarriageFuelFactor() {
        return carriageFuelFactor;
    }

    public void setCarriageFuelFactor(double carriageFuelFactor) {
        this.carriageFuelFactor = carriageFuelFactor;
    }

    @Override
    public double getRealFuelConsumption() {

        return super.getRealFuelConsumption() + (getCarriageInQuintal() * getCarriageFuelFactor());

    }

}
