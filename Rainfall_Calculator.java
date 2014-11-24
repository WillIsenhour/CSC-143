//Will Isenhour

import java.util.Scanner;

public class Rainfall_Calculator
{
   public static void main (String[] args)
   {
      int years = 0, yearsInThisLoop, month;
      final int MONTHS_IN_A_YEAR = 12;
      double totalRainfall = 0, averageRainfall, monthlyRainfall = -1;
      
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
         System.out.print("Enter the number of years: ");
         
         try
         {
            years = keyboard.nextInt();
         }
         catch (Exception e)
         {
            System.out.println("You must enter a whole number.");
            keyboard.nextLine();
         }
         
         if (years < 1)
         {
            System.out.println("You must enter a positive number.");
         }      
      }
      while (years < 1);
      
      System.out.println("Enter the rainfall, in inches, for each month./n");
      
      for (yearsInThisLoop = 1; yearsInThisLoop <= years; yearsInThisLoop++)
      {
         for (month = 1; month <= MONTHS_IN_A_YEAR; month++)
         {                        
            do
            {
               try
               {
                  System.out.printf("Year %d month %d: ", yearsInThisLoop, month);
                  monthlyRainfall = keyboard.nextDouble();
                  totalRainfall += monthlyRainfall;            
               }
               catch (Exception e)
               {
                  System.out.println("You must enter a number.");
                  keyboard.nextLine();
                  month --;
               }
               
               if (monthlyRainfall < 0)
               {
                  System.out.println("You must enter a positive number.");
               }
             }
             while (monthlyRainfall < 0);
            
         }
         System.out.println("");
      }
      
      averageRainfall = totalRainfall / (years * MONTHS_IN_A_YEAR);
      
      System.out.println("Number of months: " + (years * MONTHS_IN_A_YEAR));
      System.out.println("Total rainfall: " + totalRainfall);
      
      if (years == 1)
      {
         System.out.printf("The average rainfall for the year in question is %.2f inches.", averageRainfall);
      }
      else
      {
         System.out.printf("The average rainfall for the %d years in question is %.2f inches.", years, averageRainfall);
      }
   }
}