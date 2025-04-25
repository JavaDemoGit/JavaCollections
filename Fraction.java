import java.util.Scanner;

public class Fraction {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double numerator, denominator, result;

    System.out.println("Enter Numerator: ");
    numerator = scn.nextInt();
    System.out.println("Enter Denominator: ");
    denominator = scn.nextInt();
    System.out.println();

    result = numerator/denominator;

    System.out.println(numerator + "/" + denominator + " = "+result);
  }
}
