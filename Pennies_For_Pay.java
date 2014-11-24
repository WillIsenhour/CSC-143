import java.util.Scanner;

public class Pennies_For_Pay
{
   public static void main (String[] args)
   {
      int days, i;
      double salary, pennies = 1;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many days is this poor soul working?: ");
      days = keyboard.nextInt();
      
      while (days <= 0)
      {
         System.out.println("Enter a number greater than zero.");
         System.out.print("How many days is this poor soul working?: ");
         days = keyboard.nextInt();
      } 
      
      System.out.printf("%n %-10s %-10s %n", "Day", "Salary"); 
                 
      for (i = 1; i <= days; i++)
      {
         System.out.printf("%-10d $%-10.2f %n" , i, (pennies / 100));
         pennies *= 2; 
      }   
   }
}