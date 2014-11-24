// Will Isenhour Project 2

import java.util.*;

public class Project_2 
{
   
   //Main
   public static void main (String[] args) 
   {
      int numberOfHomes, numberOfFloors, roomsOnAFloor, occupiedRooms, totalOccupiedRooms = 0;

      System.out.print("Calculate the occupancy rate for multiple nursing homes\n" +
                       "-------------------------------------------------------\n");
      numberOfHomes = validateInput("Please enter the number of nursing homes.", 1);
      confirmInput(numberOfHomes);
       
      
      for ( int i = 1; i <= numberOfHomes; i++ )
      {
                        
         String floorPrompt = "Please enter the number of floors in nursing home number " + i + "." ;
         
         numberOfFloors = validateInput(floorPrompt, 1);
         confirmInput(numberOfFloors);
         roomsOnAFloor  = validateInput("How many rooms are there on each floor?", 10);
         confirmInput(roomsOnAFloor);
 
         for ( int j = 1; j <= numberOfFloors; j++)
         {
         
            String occupiedPrompt = "How many rooms on floor " + j + " are occupied?";
         
            occupiedRooms = validateInput(occupiedPrompt, 1, roomsOnAFloor);
            confirmInput(occupiedRooms);
            totalOccupiedRooms += occupiedRooms;         
         }
      
         generateReport(i, numberOfFloors, roomsOnAFloor, totalOccupiedRooms);  
         
         //resets for next building
         totalOccupiedRooms = 0;
      
      }       
   
   }//end of main
      
   
   //Confirm Input
   public static void confirmInput(int input)
   {
      System.out.println("  - You entered " + input + ".\n");
   }//end confirmInput
   
   
   //Validate Input Block, Overloaded Method
   
   public static int validateInput(String prompt, int minimum)
   {
      int number;
      Scanner keyboard = new Scanner(System.in);
            
      do 
      {
         System.out.println(prompt + " Must be " + minimum + " or more.");
         System.out.print("> ");
         
         while(!keyboard.hasNextInt())
         {
            System.out.println("Please enter a whole number.");
            System.out.print("> ");
            keyboard.next();
         }
         number = keyboard.nextInt();
      }      
      while (number < minimum);
      
      return number;
      
   }//end of validateInput w no Max Value
   
   public static int validateInput(String prompt, int minimum, int maximum)
   {
      int number;
      Scanner keyboard = new Scanner(System.in);
            
      do 
      {
         System.out.println(prompt + " Must be at least " + minimum + ", but not more than " + maximum + ".");
         System.out.print("> ");
         
         while(!keyboard.hasNextInt())
         {
            System.out.println("Please enter a whole number.");
            System.out.print("> ");
            keyboard.next();
         }
         number = keyboard.nextInt();
      }      
      while (number < minimum || number > maximum);
      
      return number;
            
   }//end of validateInput w Max Value
   
   //End of Validate Method Block

   
   //Generate Report
   public static void generateReport(int repHomeNumber, int repFloors, int repRoomsPerFloor, int repOccupiedRooms)
   {
      int repTotalRooms    = (repFloors * repRoomsPerFloor); 
      int repVacancy       = (repTotalRooms - repOccupiedRooms);
      double repOccupancyRate = (repOccupiedRooms / (repTotalRooms * 1.0)) * 100;
      
      String repOccupancyDescription;
      if (repOccupancyRate > 75)
      {
         repOccupancyDescription = "high";
      }
      else if (repOccupancyRate > 49)
      {
         repOccupancyDescription = "average";
      }
      else
      {
         repOccupancyDescription = "low";
      }
                  
      System.out.println("Nursing Home #" + repHomeNumber + " is a facility with " + repTotalRooms + " rooms.");
      System.out.println("Of these " + repTotalRooms + ", " + repOccupiedRooms + " are occupied and " + repVacancy + " are vacant.");
      System.out.printf("The rate of occupancy is %s at %.0f%%.", repOccupancyDescription, repOccupancyRate);
      System.out.print("\n\n");
            
   }//end of generateReport
   
}//end of class 