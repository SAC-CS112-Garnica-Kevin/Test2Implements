/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2inheritance;

import java.util.Random;

/**
 *
 * @author owner
 */
public class sportscar implements Drive
{
  
    private double gear = 8.0;
    private double totalDistance;
    private double dieNumbers;
    private double lowestValue = 1;
    private double highestValue = 6;
    private double totalCycles;
    private String discription;
    
    @Override 
    public double Throw(double dices)
    {
        dieNumbers = dices;
        lowestValue = lowestValue * dieNumbers;
        highestValue = highestValue * dieNumbers;
        Random rand = new Random();
        double cycles = lowestValue + (int)(Math.random() * ((highestValue - lowestValue) + 1));
        return cycles;
    }
    
    @Override 
    public double DistanceTraveled(double totalCycles)
    { 
        for (double cycles = 0; cycles <= totalCycles; cycles++)
        {
            if (totalCycles == 0)
            {
                totalDistance = 0; 
            }
            else if (cycles <= gear)
            {

                totalDistance += (cycles * 10)/60.00;
                this.totalDistance += (cycles * 10)/60.00;
            }
            else if (cycles > gear)
            {
                totalDistance += (gear * 10)/60.00;
                this.totalDistance += (cycles * 10)/60.00;
            }
            
        }
        this.totalCycles = totalCycles;
        return totalDistance;
    }
    
    @Override 
    public void About(double totalDistance)
    {
        System.out.println("Sporty the Red 2015 Chevrolet Corvette, has traveled " + totalDistance + " Miles");
    }
}
