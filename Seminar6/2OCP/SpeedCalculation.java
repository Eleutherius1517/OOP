package Seminar6.2OCP;

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
    return vehicle.getMaxSpeed();
    
}

public class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        if (!getType().equalsIgnoreCase("Car") || getType().equalsIgnoreCase("Bus")) return 0;
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }
}
public class Car extends Vehicle{

    public Car(int maxSpeed) {
        super((int)(maxSpeed * 0.8), "Car");
    }

}
public class Bus extends Vehicle{

    public Bus(int maxSpeed) {
        super((int)(maxSpeed * 0.6), "Bus");
    }
    
}
