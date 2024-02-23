public class Assign3A4 {

  public static void main(String[] args) {

    System.out.println("Pattern 1:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 2:");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 3:");

    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 4:");
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 5:");
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print(i);
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 6:");
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = i; k >= 1; k--) {
        System.out.print(k);
      }
      for (int l = 2; l <= i; l++) {
        System.out.print(l);
      }
      System.out.println();
    }
  }
}
