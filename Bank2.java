import java.util.*;
import java.io.*;

public class Bank2
{
   public static void main(String[] args) throws FileNotFoundException
   {
      double total = fileRead();
      System.out.println("Total:\t "  + total);
      
      
   }//end main


   public static double fileRead() throws FileNotFoundException
   {
      File file = new File("AcctInfo.txt");
      Scanner inputFile = new Scanner(file);
      PrintWriter outputFile = new PrintWriter("AcctSummary2.txt");
      
      double total;
      
      while(inputFile.hasNext())
      {
         String acctNumber  = inputFile.nextLine();
         String acctType    = inputFile.nextLine();
         String custName    = inputFile.nextLine();
         String custType    = inputFile.nextLine();
         String balance_str = inputFile.nextLine();
         String space       = inputFile.nextLine();
         
         outputFile.println("Account Number:\t "  + acctNumber);
         outputFile.println("Account Type:\t "    + acctType);
         outputFile.println("Customer Name:\t "   + custName);
         outputFile.println("Customer Type:\t "   + custType);
         
         //Converts balance_str into a number
         double balance = Double.parseDouble(balance_str);
         
         //Calls this crazy new thing
         double monthlyFee = calcMonthlyFee(acctType, custType, balance);
         
         outputFile.printf("Account Balance: $%.2f", balance);
         outputFile.println();
         outputFile.printf("Monthly Fee: $%.2f", monthlyFee);
         
         //Adds a space after each account block because DAYUM
         outputFile.println();
         outputFile.println();
         
         total = total + balance;        
         
      }//end while
   
      return total;
   
   }//end fileRead


   public static double calcMonthlyFee(String acctType, String custType, double balance)
   {
      double monthlyFee;
      
      if (acctType.equals("Savings"))
      {
         monthlyFee = 0.0;
      }
      else
      {
         if (custType.equals("Value"))
         {
            if (balance >= 1500)
            {
               monthlyFee = 0.0;
            }
            else
            {
               monthlyFee = 5.0;
            }
         }         
         else if (custType.equals("Advantage"))
         {
            if (balance >= 1000)
            {
               monthlyFee = 0.0;
            }
            else
            {
               monthlyFee = 10.0;
            }
         }         
         else
         {
            if (balance >= 25000)
            {
               monthlyFee = 0.0;
            }
            else
            {
               monthlyFee = 30.0;
            }
         }
      }
      
      return monthlyFee;
      
   }//end calcMonthlyFee

}//end class