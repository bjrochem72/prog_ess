public class Assign3A3
 {
  public static void main(String args[])
   {

    int currentValue = 9;

    System.out.println("The number is: "+ currentValue);

    int factorial = 1;
     for (int i = 1; i <= currentValue; i++) 
      {
       factorial *= i;
      }
     System.out.println ("The factorial of " + currentValue + " is: " + factorial);
   }
}