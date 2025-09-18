import java.util.Scanner;
public class Assignment1Program2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a base (2-36)");
int base = scanner.nextInt();
int largest4Digit = (int) Math.pow(base, 4) - 1;
System.out.println("the maximum, 4-digit, base 10 number in base " + base + " is " + largest4Digit);
System.out.print("now, enter a base 10 number in range 0 to" + largest4Digit + "to convert:");
int number = scanner.nextInt();
String converted = Integer.toString(number,base);
System.out.println(number + "(base 10)=" + converted + "(base)" + base);
scanner.close();
}
}
