package DSA;

class VehicleBase {
    int speed;
    int fuel;

    public VehicleBase(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void displayDetails() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " L");
    }
}

class Car extends VehicleBase {
    public Car(int speed, int fuel) {
        super(speed, fuel);
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        super.displayDetails();
    }
}

class Bike extends VehicleBase {
    public Bike(int speed, int fuel) {
        super(speed, fuel);
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Details:");
        super.displayDetails();
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Car car = new Car(120, 40);
        Bike bike = new Bike(80, 15);

        car.displayDetails();
        bike.displayDetails();
    }
}
