//Will Isenhour

import java.util.*;

public class Sales
{
   public static void main (String[] args)
   {
      double sales, bonus, totalBonuses = 0;
      final double BONUS_RATE = 0.1;

      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a negative number to exit.");
      System.out.println("--------------------------------\n");
      
      do 
      {
         System.out.print("Enter the amount of a sale: ");
         
         try
         {
            sales = keyboard.nextDouble();
         }
         catch (Exception e)
         {
            //showErrorMessage();
            System.out.println("You must enter a number.");
            sales = 0.0;
         }

         if (sales >= 0)
         {         
            bonus = sales * BONUS_RATE;
            totalBonuses += bonus;
            System.out.printf("\t The bonus for this sale is $%.2f. %n", bonus);
         }
      } 
      while (sales >= 0);
      
      System.out.printf("%n The total of all bonuses for this session comes to $%.2f", totalBonuses);     
   }
   
//   public static void showErrorMessage()
//   {
//      System.out.println("You must enter a number.");
//   }
}