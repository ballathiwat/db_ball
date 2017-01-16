
package DesignPattern.FactoryMethod;

public class Submarine extends Vehicle {
    public void refuel(){
        System.out.println("-Refuel");
        fuelLevel = fuelLevel + 1000;
    }
    public int geFuel(){
        return fuelLevel;
    }
    public void move(){
        System.out.println("-Dive Dive Dive !");
        fuelLevel = fuelLevel -30;
    }
    public Submarine(){
        System.out.println("Hello, I am Submarine");
        fuelLevel =0;
    }
    
    
}

