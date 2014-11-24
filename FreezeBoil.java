// Will Isenhour

public class FreezeBoil
{
   private double temperature;
   public static final int ETHYL_BOIL = 172,
                           ETHYL_FREEZE = -173,
                           OXYGEN_BOIL = -306,
                           OXYGEN_FREEZE = -362,
                           WATER_BOIL = 212,
                           WATER_FREEZE = 32;

   public FreezeBoil()
   {
      //do nothing constructor
   }
   
   public FreezeBoil(double t)
   {
      temperature = t;
   }
   
   public void setTemp(double t)
   {
      temperature = t;
   }
   
   public double getTemp()
   {
      return temperature;
   }
      
   public boolean isEthylBoiling()
   {
      boolean answer = tempcheck(ETHYL_BOIL, true);
      return answer;    
   }

   public boolean isEthylFreezing()
   {
      boolean answer = tempcheck(ETHYL_FREEZE, false);
      return answer; 
   }

   public boolean isOxygenBoiling()
   {
      boolean answer = tempcheck(OXYGEN_BOIL, true);
      return answer;    
   }

   public boolean isOxygenFreezing()
   {
      boolean answer = tempcheck(OXYGEN_FREEZE, false);
      return answer; 
   }
   
   public boolean isWaterBoiling()
   {
      boolean answer = tempcheck(WATER_BOIL, true);
      return answer;    
   }

   public boolean isWaterFreezing()
   {
      boolean answer = tempcheck(WATER_FREEZE, false);
      return answer; 
   }   

   public boolean tempcheck(int constant, boolean state)
   {
      if (state)
      {
         if (temperature >= constant)
         {
            return true;
         }
         else
         {
            return false;
         }
      }
      else
      {
         if (temperature <= constant)
         {
            return true;
         }
         else
         {
            return false;
         }
      }
   }
}