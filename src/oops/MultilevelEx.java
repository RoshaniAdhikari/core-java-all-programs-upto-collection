package oops;

//Base class
class Vehicle {
 void start() {
     System.out.println("Vehicle is starting...");
 }

 void stop() {
     System.out.println("Vehicle is stopping...");
 }
}

//Intermediate class inheriting from Vehicle
class Car extends Vehicle {
 void drive() {
     System.out.println("Car is in motion...");
 }

 void brake() {
     System.out.println("Car is braking...");
 }
}

//Derived class inheriting from Car
class SportsCar extends Car {
 void accelerate() {
     System.out.println("Sports car is accelerating...");
 }

 void turboBoost() {
     System.out.println("Sports car is boosting with turbo...");
 }
}

//Main class to test multilevel inheritance
public class MultilevelEx {
 public static void main(String[] args) {
     // Create an object of the base class
     Vehicle vehicle = new Vehicle();
     vehicle.start();
     vehicle.stop();
     System.out.println();

     // Create an object of the intermediate class
     Car car = new Car();
     car.start();
     car.drive();
     car.brake();
     car.stop();
     System.out.println();

     // Create an object of the derived class
     SportsCar sportsCar = new SportsCar();
     sportsCar.start();
     sportsCar.drive();
     sportsCar.accelerate();
     sportsCar.turboBoost();
     sportsCar.brake();
     sportsCar.stop();
 }
}

