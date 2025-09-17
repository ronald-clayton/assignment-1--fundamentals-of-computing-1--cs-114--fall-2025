import java.util.Random;
import java.util.Scanner;
public class Assignment1Program1 {
  public static void main(String[] args) {
 System.out.println("RRRRRR       CCCCC");
 System.out.println("RR    RR    C");
 System.out.println("RRRRRRR     C");
 System.out.println("RR   RR     C");
 System.out.println("RR    RR      CCCCC");
 System.out.println();
 Scanner scanner = new Scanner(System.in);
 System.out.print("Please enter 5-character string:");
 String input = scanner.nextLine();
 String trimmed= input.substring(1, 4);
 String reversed = new StringBuilder(trimmed).reverse().toString();
 System.out.print("\nPlease enter a number in Fahrenheit: ");
 double fahrenheit = scanner.nextDouble();
 scanner.nextLine();
 double celsius = (fahrenheit-32) * 5.0 / 9.0;
 Random random = new Random();
 int randomNumber = random.nextInt(16384 - 32 + 1) + 32;
 System.out.println("\n Combined Output:");
 System.out.println("reversed middle string:" + reversed);
 System.out.println("Celsius" + celsius);
 System.out.println("Random number" + randomNumber);
 System.out.println("\n Random number generated. Continuing...");
 System.out.println("Your new string is" + reversed);
 System.out.println(celsius + reversed + randomNumber);
 scanner.close();
}
}
