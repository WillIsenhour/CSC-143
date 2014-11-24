//Will Isenhour

import java.util.Scanner; 

/**
   This program determines if a user qualifies for a loan.
*/

public class Qualify
{
   public static void main(String[] args)
   {         
   
        //declare variables
        double salary;
        double yearsOnJob;
        String input; 
        
        Scanner keyboard = new Scanner(System.in);
        
        //get the user's annual salary
        displayMessage("Enter your annual salary.");
        salary = keyboard.nextDouble();       
        
        //get the number of years at the current job
        displayMessage("How long have you worked at the company?: ");
        yearsOnJob = keyboard.nextDouble();
        
        qualifyDetermination(salary, yearsOnJob);
   
   }//end of main

   static void displayMessage(String output)
   {
      System.out.println(output);
   }//end displayMessage
   
   static void qualifyDetermination(double qualSalary, double qualTenure)
   {
      if (qualSalary >= 30000 || qualTenure >=2)
      {
         displayMessage("You qualify for the loan.");
      }
      else        
      {
         displayMessage("You do not qualify for the loan.");            
      }   
   }//end qualifyDetermination

}