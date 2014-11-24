//Will Isenhour
   
public class Employee
{
   private String empName;
   private int    empID;
   private String empDept;
   private String empPos;

   // Constructors 
   
   public Employee()
   {
      // Do-nothing Constructor
   }
   
   public Employee(String name, int id, String dept, String pos)
   {
      setName(name);
      setID(id);
      setDept(dept);
      setPos(pos);
   }

   // End Constructors
   

   // Setters
   
   public void setName(String n)
   {
      empName = n;
   }
   
   public void setID(int i)
   {
      empID = i;
   }
   
   public void setDept(String d)
   {
      empDept = d;
   }
   
   public void setPos(String p)
   {
      empPos = p;
   }
   
   // End Setters

   
   // Getters
   
   public String getName()
   {
      return empName;
   }

   public int getID()
   {
      return empID;
   }

   public String getDept()
   {
      return empDept;
   }

   public String getPos()
   {
      return empPos;
   }

   // End Getters


   // Generate Report Method
   
   public void generateReport()
   {
      System.out.println("Employee Name: " + this.getName());
      System.out.println("Employee ID Number: " + this.getID());
      System.out.println("Department: " + this.getDept());
      System.out.println("Position: " + this.getPos());
      System.out.println("");
   }
   
}