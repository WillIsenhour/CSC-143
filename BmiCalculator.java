import java.util.Scanner;

/**
   This class goes out to the one I love.
   This class goes out to the one I left...behind.

   @author Telegram Sam
   @version 1.0 (today's date)
*/

public class BmiCalculator 
{
   
   /**
      The entry point to our program
      @param args an array of <code>String</code> 
      objects containing the command line arguments
   */
   
   public static void main (String [] args)
   {
      // delcare & initialize variables
      double weight = 0, height = 0, bmi = 0;
      String message = "Your BMI is ";
      
      Scanner keyboard = new Scanner(System.in);
      
      //prompt for input
      System.out.print("Please enter your weight in pounds: ");
      weight = keyboard.nextDouble();
      System.out.print("Please enter your height in inches: ");
      height = keyboard.nextDouble();
      
      // BMI = Weight * 703 / Height^2
      bmi = (weight * 703) / (height * height);
      
      if (bmi < 18.5)
         {
            message += (bmi + ". You are underweight.");
         }
      else 
         {
            if (bmi > 25)
               {
                  message += (bmi + ". You are overweight.");
               }
            else
               {
                  message += (bmi + ". Your weight is optimal.");
               }
         }
         
      // The bad news
      System.out.println(message);     
      
   }

}
