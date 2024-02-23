public class Assign3A5 {

  public static void main(String args[]) {
    int currentValue = 9;
    System.out.println("The number is: " + currentValue);

    int factorial = 1;
    int i = 1;
    while (i <= currentValue) {
      factorial *= i;
      i++;
    }
    System.out.println(
      "The factorial of " + currentValue + " is: " + factorial
    );
  }
}
