public class Assign3A6 {

  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;

    System.out.println("Pattern 1:");
    i = 0;
    while (i < 3) {
      j = 1;
      while (j < 10) {
        System.out.print("*");
        j++;
      }
      i++;
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 2:");
    i = 1;
    while (i <= 5) {
      j = 1;
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      i++;
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 3:");
    i = 1;
    while (i <= 5) {
      j = 5;
      while (j > i) {
        System.out.print(" ");
        j--;
      }
      k = 1;
      while (k <= i) {
        System.out.print("*");
        k++;
      }
      i++;
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 4:");
    i = 1;
    while (i <= 5) {
      j = 5;
      while (j > i) {
        System.out.print(" ");
        j--;
      }
      k = 1;
      while (k <= ((2 * i) - 1)) {
        System.out.print("*");
        k++;
      }
      i++;
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 5:");
    i = 1;
    while (i <= 5) {
      j = 5;
      while (j > i) {
        System.out.print(" ");
        j--;
      }
      k = 1;
      while (k <= ((2 * i) - 1)) {
        System.out.print(i);
        k++;
      }
      i++;
      System.out.println();
    }

    System.out.println();
    System.out.println("Pattern 6:");
    i = 1;
    while (i <= 5) {
      j = 5;
      while (j > i) {
        System.out.print(" ");
        j--;
      }
      k = i;
      while (k >= 1) {
        System.out.print(k);
        k--;
      }
      l = 2;
      while (l <= i) {
        System.out.print(l);
        l++;
      }

      i++;
      System.out.println();
    }
  }
}
