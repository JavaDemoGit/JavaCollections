import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateCharRemove {
  /* 
    public static void main(String[] args) {
        String str = "aabbccddeeff";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
        */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter any duplicated words string : ");
        String input = scn.nextLine();

        LinkedHashSet<Character> unique = new LinkedHashSet<>();
        for (char ch : input.toCharArray()) {
            unique.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : unique) {
            sb.append(ch + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
