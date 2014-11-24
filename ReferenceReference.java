import java.util.Scanner;

class Zaney 
{
   private String name;
   private String line;
   private int rank;
   
   public Zaney() {/*DO NOTHING*/}
   public Zaney(String n, String l, int r)
   {
      name = n;
      line = l;
      rank = r;
   }
   
   public String toString() {
      return "Zaney named " + name 
            + ", says " + line 
            + ". Rank is " + rank 
            + ".";   
   }
   
   public String getName() {
      return name;
   } 
      
   public String getLine() {
      return line;
   } 

   public int getRank() {
      return rank;
   } 
  
   public void setName(String n) {
      name = n;
   }   

   public void setLine(String l) {
      line = l;
   }   

   public void setRank(int r) {
      rank = r;
   }   
}

class Stooge extends Zaney{
   
   Stooge(){}
   Stooge(String n, String l, int r){
      super(n, l, r);
   }

   public String toString() {
      return "\nStooge number" + getRank()
             + " - " + getName() + " says, \"" + getLine()
             + "\"."; 
   }
   
   public int hashCode() 
   {
      return getName().hashCode() + getLine().hashCode() + getRank();
   }
   
   public boolean equals(Object o) 
   {
      if (o instanceof Stooge) 
      {
         Stooge other = (Stooge)o;
            return   (other.getName().equals(this.getName()))
                  && (other.getLine().equals(this.getLine()))
                  && (other.getRank() == this.getRank());
      } 
      else 
      {
         return false;
      }
   }
   
}

public class ReferenceReference 
{
   public static void main (String[] args)
   {
      Stooge curly = new Stooge("Curly", "Nyuk Nyuk Nyuk", 3);
      Stooge alsoCurly = new Stooge("Curly", "Nyuk Nyuk Nyuk", 3);
      
      System.out.println(curly);   
      System.out.println(alsoCurly);
      System.out.println((curly == alsoCurly));
      System.out.println(curly.equals(alsoCurly));
      curly = alsoCurly;
      System.out.println((curly == alsoCurly));
      System.out.println(curly.equals(alsoCurly));      
   }
}
      