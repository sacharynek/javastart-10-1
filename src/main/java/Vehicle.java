public class Vehicle {

    private String name;
    private int tankCapacity;
    private double fuelConsumption;


    public Vehicle() {
    }

    public Vehicle(String name, int tankCapacity, double fuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getRealFuelConsumption() {
        return getFuelConsumption();
    }

    public double getRange() {
        return getTankCapacity() / getRealFuelConsumption() * 100;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Vehicle{ " +
                " name= " + name + '\'' +
                ", tankCapacity= " + tankCapacity +
                ", fuelConsumption= " + fuelConsumption +
                '}';
    }
}
