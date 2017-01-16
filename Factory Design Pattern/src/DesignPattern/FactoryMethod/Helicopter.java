
package DesignPattern.FactoryMethod;

public class Helicopter extends Vehicle {
    public void refuel(){
        System.out.println("-Reuel"); 
        fuelLevel = fuelLevel+500;    
    }
    public int getFuel(){
        return fuelLevel;
    }
    public void move(){
        System.out.println("-Fly Fly Fly!");
        fuelLevel = fuelLevel - 20;
    }
    public Helicopter(){
        System.out.println("-Hello, I am Helicopter");
         fuelLevel = 0;
    }
   
}
