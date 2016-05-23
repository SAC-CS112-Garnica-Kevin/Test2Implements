
package test2inheritance;
import java.util.Scanner;

public class Test2Inheritance {

    
    public static void main(String[] args) 
    {
        int numberOfDie;
        int cycles;
        double totalDistance; 
        String userRestarting; 
        boolean restart;
        
        Scanner scan = new Scanner(System.in); 
        
        Drive[]  About = new Drive [3];
        
        truck Truck = new truck();
        van Van = new van();
        sportscar Sportscar = new sportscar();
        
        
        System.out.print("Please input the number of Dice you want to throw: ");
        numberOfDie = scan.nextInt();
        System.out.println(" ");
        
        

        About[0] = Truck;
        About[1] = Van;
        About[2] = Sportscar;
        
        do 
        {
            for (Drive X: About)
            {
                double TotalCycles = (X.Throw(numberOfDie));
                System.out.println("The Cycle for this Run will be " + TotalCycles);
                X.About(X.DistanceTraveled(TotalCycles));
                System.out.println(" ");

            }
            
            System.out.print("Do You Wish to Run Another Cycle: ");
            userRestarting = scan.next();
            System.out.println(" ");
            
            while (true)
            {
                if (userRestarting.equalsIgnoreCase("Yes"))
                {
                    restart = true;
                    break;
                }
                else if (userRestarting.equalsIgnoreCase("no"))
                {
                    restart = false; 
                    break;
                }
                else
                {
                    System.out.println("Invalid Input Try Again");
                    System.out.println(" ");
                    System.out.print("Do You Wish to Run Another Cycle: ");
                    userRestarting = scan.next();
                    System.out.println(" ");
                }
            } 
            
        }while (restart);
        
       
        
        
        
    }
    
}

//1. Please create an Automabile class that implement Drive.  Truck/Sport extends Automobile
//2. Need to implement toString ....About is good, but not generic

