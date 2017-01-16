/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.FactoryMethod;

/**
 *
 * @author SCM
 */
public class Vehicle_Creator {
    public Vehicle createVehicle(String order){
        if(order.equals("Helicopter")){
            return(new Helicopter());
        }
        else {
            if(order.equals("Submarine")){
                return(new Submarine());
            }
            else{
                System.out.println("Out of Spec.");
                return(null);
            }
        
        }
    }
    
    
}
