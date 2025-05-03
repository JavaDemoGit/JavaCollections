import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateWordsRemove {
  /* 
    public static void main(String[] args) {
        String str = "This is is a a test test string string";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.append(words[i]).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
        */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter any duplicated words string : ");
        String[] words = scn.nextLine().split(" ");

        LinkedHashSet<String> unique = new LinkedHashSet<>();
        for (String word : words) {
            unique.add(word.toLowerCase());
        }

        System.out.println(String.join(" ", unique));
    }
}
