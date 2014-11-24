// Pg 106, #8, Sales Tax Widget

import java.util.*;
import java.text.*;

public class SalesTax
{
   public static void main(String[] args)
   {
      double STATE_SALES_TAX = 0.04;
      double COUNTY_SALES_TAX = 0.02;
      double purchaseAmount;
      
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("Enter the amount of the purchase > ");
      purchaseAmount = keyboard.nextDouble();
   
      double stateTax =       (purchaseAmount * STATE_SALES_TAX);
      double countyTax =      (purchaseAmount * COUNTY_SALES_TAX);
      double totalSalesTax =  (stateTax + countyTax);
      double grandTotal =     (purchaseAmount + stateTax + countyTax);
   
      DecimalFormat df = new DecimalFormat("#.00");
   
      System.out.println("\nThe purchase price was: $" + df.format(purchaseAmount));
      System.out.println("The state sales tax for this purchase comes to: $" + df.format(stateTax));
      System.out.println("The county sales tax for this purchase comes to: $" + df.format(countyTax));
      System.out.println("The total tax for this sale was: $" + df.format(totalSalesTax));
      System.out.println("The total amount of the purchase after tax is: $" + df.format(grandTotal));      
   }
}