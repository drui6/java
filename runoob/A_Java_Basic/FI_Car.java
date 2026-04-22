class Vehicle {}
 
public class FI_Car extends Vehicle {
   public static void main(String[] args){
      Vehicle a = new FI_Car();
      boolean result =  a instanceof FI_Car;
      System.out.println(result);
   }
}