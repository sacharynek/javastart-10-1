public class Car extends Vehicle {

    private boolean isAirConditioningOn;
    private double airCondFuelFactor;

    public Car() {
    }


    public Car(String name, int tankCapacity, double fuelConsumption, boolean isAirConditioningOn) {
        super(name, tankCapacity, fuelConsumption);
        this.isAirConditioningOn = isAirConditioningOn;
        this.airCondFuelFactor = 0.8;
    }

    public boolean isAirConditioningOn() {
        return isAirConditioningOn;
    }

    public void setAirConditioningOn(boolean airConditioningOn) {
        isAirConditioningOn = airConditioningOn;
    }

    public double getAirCondFuelFactor() {
        return airCondFuelFactor;
    }

    public void setAirCondFuelFactor(double airCondFuelFactor) {
        this.airCondFuelFactor = airCondFuelFactor;
    }

    @Override
    public double getRealFuelConsumption() {

        if (isAirConditioningOn()) {
            return getFuelConsumption() + getAirCondFuelFactor();
        } else {
            return getFuelConsumption();
        }
    }

    @Override
    public String toString() {
        return "Car{ " +
                " name= " + getName() + '\'' +
                ", tankCapacity= " + getTankCapacity() +
                ", fuelConsumption= " + getFuelConsumption() +
                ", isAirConditioningOn= " + isAirConditioningOn +
                ", airCondFuelFactor= " + airCondFuelFactor +
                '}';
    }
}
