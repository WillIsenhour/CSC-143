// Will Isenhour

public class EmployeeDemo
{

   public static void main(String[] args)
   {
      Employee emp01 = new Employee("Susan Meyers", 47899, "Accounting",    "Vice President");
      Employee emp02 = new Employee("Mark Jones",   39119, "IT",            "Software Developer");
      Employee emp03 = new Employee("Joy Rogers",   81774, "Manufacturing", "Engineer");
      
      emp01.generateReport();
      emp02.generateReport();
      emp03.generateReport();   
   
   }// End main

}// End class