// Will Isenhour

import java.util.*;

public class FreezeBoilDemo
{
   public static void main(String[] args)
   {
      String input = "";
      double temperature = 0.0;
      Scanner in = new Scanner(System.in);
      FreezeBoil fb = new FreezeBoil();
         
      System.out.print("Enter a temperature: ");
      try 
      {
         input = in.next();
         temperature = Double.parseDouble(input);
      }      
      catch (Exception e)
      {
         e.printStackTrace();
      }

      fb.setTemp(temperature);
            
      System.out.println("At " + fb.getTemp() + " degrees Fahrenheit:");
      
      if (fb.isEthylBoiling())
         {System.out.println("Ethyl alcohol boils.");}
      if (fb.isEthylFreezing())
         {System.out.println("Ethyl alcohol freezes.");}
      if (fb.isOxygenBoiling())
         {System.out.println("Oxygen boils.");}
      if (fb.isOxygenFreezing())
         {System.out.println("Oxygen freezes.");}
      if (fb.isWaterBoiling())
         {System.out.println("Water boils.");}
      if (fb.isWaterFreezing())
         {System.out.println("Water freezes.");}
   }
}