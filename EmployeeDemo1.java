/**
   This program demonstrates a solution to the
   Employee Class programming challenge.
*/

public class EmployeeDemo1
{
   public static void main(String[] args)
   {
           
            
      // Create an employee.       
      Employee employee1 = new Employee("Mark Jones", 39119,
                                        "IT", "Programmer");

       
            
      // Display the data for employee.
      System.out.println("Employee #1");
      System.out.println("Name: " + employee1.getName());
      System.out.println("ID Number: " + employee1.getIdNumber());
      System.out.println("Department: " + employee1.getDepartment());
      System.out.println("Position: " + employee1.getPosition());
      System.out.println();
      
   }
}

