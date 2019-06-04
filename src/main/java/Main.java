public class Main {

    public static void main(String[] args) {
        Car[] tab = new Car[5];
        tab[0] = new Truck("Kamaz", 1000, 15.0, true, 1000);
        tab[1] = new Car("VW Golf", 60, 7.0, true);
        tab[2] = new Truck("Man", 2000, 20.0, true, 2000);
        tab[3] = new Car("Fiat", 45, 8.0, true);
        tab[4] = new Truck("DAF", 2500, 10.0, true, 4000);

        for (Car v : tab) {
            System.out.println(v);
            System.out.format("fuel consumption %.2f liter per 100km\n", v.getFuelConsumption());
            System.out.format("real fuel consumption %.2f liter per 100 km\n", v.getRealFuelConsumption());
            System.out.format("range %.2f km\n", v.getRange());
            v.setAirConditioningOn(false);
            System.out.println(v);
            System.out.format("fuel consumption %.2f liter per 100km\n", v.getFuelConsumption());
            System.out.format("real fuel consumption %.2f liter per 100 km\n", v.getRealFuelConsumption());
            System.out.format("range %.2f km\n", v.getRange());
        }
    }
}
