//Farenheit to Celsius conversion

import java.util.*;

public class temperatureConverter
{
   public static void main(String[] args)
   {
      int degreesFarenheit, degreesCelsius;
      final double CONVERSION_RATIO = 0.55556;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a temperature in degrees Farenheit to convert to Celsius.");
      System.out.print("> ");
      
      //Input Validation
      while(!keyboard.hasNextInt())
      {
         System.out.println("Please enter a whole number.");
         System.out.print("> ");
         keyboard.next();
      }
      degreesFarenheit = keyboard.nextInt();
      degreesCelsius = (int)((degreesFarenheit - 32) * CONVERSION_RATIO);
      System.out.print(degreesFarenheit + " degrees Farenheit equals " + degreesCelsius + " degrees Celsius.");    
   }
}