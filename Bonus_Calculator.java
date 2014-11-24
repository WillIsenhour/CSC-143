//Will Isenhour

import java.util.*;

public class Bonus_Calculator
{
   static final double BONUS_RATE = 0.1;
   
   public static void main (String[] args)
   {
      double salesAmount1, salesAmount2, bonusAmount;      
      
      salesAmount1 = getSales("Enter First Sales Amount: ");
      salesAmount2 = getSales("Enter Second Sales Amount: ");
      bonusAmount = calculateBonus(salesAmount1, salesAmount2);

      System.out.println("");
      System.out.println("First Sales Amount: " + salesAmount1);
      System.out.println("Second Sales Amount: " + salesAmount2);
      System.out.println("Bonus Rate: " + (BONUS_RATE * 100) + "%");
      System.out.println("Total Sales: " + (salesAmount1 + salesAmount2));
      System.out.println("Total Bonus: " + bonusAmount);
   }
      
   static double getSales(String prompt)
   {
      double sales;      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print(prompt);
      sales = keyboard.nextDouble();
      
      return sales;
   }
   
   static double calculateBonus(double calc01, double calc02)
   {
      double bonus = (calc01 + calc02) * BONUS_RATE;
      return bonus;
   }

}