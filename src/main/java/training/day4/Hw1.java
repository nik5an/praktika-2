package training.day4;

public class Hw1 {
    public static void main(String[] args) {
        Vehicle moped = new Vehicle(50, 8);
        SportCar bmw = new SportCar(300, 252);
        RaceMotorcycle kawasaki = new RaceMotorcycle(100, 63);
        Car lada = new Car(400, 95);

        moped.drive(20);
        bmw.drive(180);
        kawasaki.drive(150);
        lada.drive(230);
    }
}
