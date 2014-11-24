//Will Isenhour

public class KPH_MPH_Conversion
{
   public static void main (String[] args)
   {
      double mph, kph;
      final double CONVERSION = 0.6214, INCREMENT = 10;

      System.out.printf("%-10s %-10s %n", "KPH", "MPH");
      
      for (kph = 60; kph < 131; kph = kph + INCREMENT)
      {
         mph = kph * CONVERSION;
         System.out.printf("%-10.0f %-10.1f %n", kph, mph);
      }      
   }
}