package day14;

public class Vehicle {
    long registrationNumber;

    String  transferOwnership(String newowner){
        System.out.println(" transferring ownership to "+newowner);
        return newowner;
    }
}

class Car extends Vehicle{
    int numberOfDoors;
}

class Truck extends Vehicle{
    int numberOfAxel;

}

class MotorCycle extends Vehicle{
    int numberOfWheel;

}


