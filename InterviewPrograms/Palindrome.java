import java.util.Scanner;

public class Palindrome {

  /*
   * public static boolean isPalindrome(String str) {
   * int left = 0;
   * int right = str.length() - 1;
   * 
   * while (left < right) {
   * if (str.charAt(left) != str.charAt(right)) {
   * return false;
   * }
   * left++;
   * right--;
   * }
   * return true;
   * }
   * 
   * public static void main(String[] args) {
   * String str = "madam";
   * System.out.println("Is the string \"" + str + "\" a palindrome? " +
   * isPalindrome(str));
   * }
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Please Enter anything : ");
    String input = scn.next();
    String reverse = "";

    for (int i = input.length() - 1; i >= 0; i--) {
      reverse += input.charAt(i);
    }
    System.out.println("Checking Palindrome... ");
    if (reverse.equalsIgnoreCase(input))
      System.out.println("Given String is Palindrome.");
    else
      System.out.println("Given String is not Palindrome.");
  }

}
