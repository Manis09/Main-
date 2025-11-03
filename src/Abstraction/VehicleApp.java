package Abstraction;
class Vehicle{
    void start(){
        System.out.println("Vehical starts");
    };
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println("Scooter starts with kick");
    }
}
public class VehicleApp {
    public static void main(String[] args) {
       Vehicle vehicle=new Car();
       vehicle.start();
    }
}
