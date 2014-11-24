// Will Isenhour

// This program displays total sales and bonus amount
 
import java.util.Scanner;
import java.text.DecimalFormat;

public class Bonus
{
   public static void main(String[] args)
   {

      //global variables
      
      double sales, bonusRate, bonus; 
       
      displayMessage();
      sales = getSales();
      bonusRate = getBonusRate();
      bonus = calculateBonus(sales, bonusRate);
      generateReport(sales, bonusRate, bonus);
      
   }
   
   public static void displayMessage()
   {
      System.out.println();
      System.out.println("Sales and Bonus calculator");
      System.out.println("--------------------------");
      System.out.println();
   }

   public static double getSales()
   {
      double s = 0, i;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the sales to calculate, enter a negative number to exit.");
      
      do
      {    
         System.out.print("Enter sales amount> ");
         i = keyboard.nextDouble();
         
         if(i > 0)
         {
            s += i;
         }
         else
         {
            System.out.println("   exiting...");
         }
      }
      while(i > 0);
      
      //keyboard.next();
      
      return s;      
   }
   
   public static double getBonusRate()
   {
      double b;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the bonus rate> ");
      b = keyboard.nextDouble();
      return b;
   }

   public static double calculateBonus(double s, double br)
   {
      double tb;
      tb = s * br;
      return tb;
   }

   public static void generateReport(double s, double br, double b)
   {
      System.out.printf("For sales totaling %.2f and a bonus rate of %.2f, the total bonus is %.2f.", s, br, b);
   }

}
