
package DesignPattern.FactoryMethod;

public class Vehicle_Client {
    public static void main(String[] args){
        Vehicle_Creator creator = new Vehicle_Creator();
        int fuelLevel;
        //-----------------
        System.out.println("****** Produce First Masterpiece ******");
        Vehicle helicopter = creator.createVehicle("Helicopter");
        helicopter.refue();
        fuelLevel = helicopter.getFuel();
        System.out.println("-Current Fuel Level is"+fuelLevel);
        helicopter.move();
        fuelLevel = helicopter.getFuel();
        System.out.println("-Current Fuel Level is"+fuelLevel);
        //-----------------
        System.out.println();
        System.out.println("****** Produce Second Masterpiece ******");
        Vehicle submarine = creator.createVehicle("Submarine");
        submarine.refue();
        fuelLevel = submarine.getFuel();
        System.out.println("");
        System.out.println("****** Produce Third Masterpiece ******");
        Vehicle sportCar = creator.createVehicle("Sport Car");

    }
}

