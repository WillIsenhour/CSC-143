//Will Isenhour

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Bonus_demo
{
   public static void main(String[] args)
   {
      double totalSales, bRate;
      
      displayTitle();
      
      totalSales = getSales();
      bRate = rate();
      
      Bonus bonusCalc = new Bonus();
      
      bonusCalc.setSales(totalSales);
      
      bonusCalc.setRate(bRate);
      
      DecicmalFormat formatter = new DecimalFormat("#,##0.00");
   
      JOptionPane.showMessageDialog(null, "Total Sales: $" + formatter.format(bonusCalc.getSales())));
      JOptionPane.showM
   
   }

   public static void displayTitle()
   {
      
   }

   public static double getSales()
   {
      double sales;
      double total = 0.0;
      String input;
      
      input = JOptionPane.showInputDialog("Enter the sales:  Enter -1 to stop");
      sales = Double.parseDouble(input);
      
      while (sales >= 0)
      {
         total += sales;
         
         
      
      }
   }
   
  

}