package training.day4;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int hp;

    public double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        fuelConsumption = num;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        fuel = num;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        hp = num;
    }

    public Vehicle(double fuel, int hp) {
        setFuel(fuel);
        setHp(hp);
        fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double km) {
        fuel -= km * fuelConsumption;

        if (fuel < 0) {
            System.out.println("No fuel");
        } else {
            System.out.println("Fuel: " + fuel);
        }
    }
}
