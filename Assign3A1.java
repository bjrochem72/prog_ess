public class Assign3A1 {

  public static void main(String args[]) {
    // Vowels: a,e,i,o,u

    char someChar = 'a';

    System.out.println("Char is: " + someChar);

    switch (someChar) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println(someChar + " is consonant.");
        break;
      default:
        System.out.println(someChar + " is vowel.");
    }
  }
}
