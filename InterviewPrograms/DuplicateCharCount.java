import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharCount {
  
  /*
    public static void main(String[] args) {
        String str = "aabbccddeeff";
        int[] count = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            count[c]++;
        }

        System.out.println("Duplicate characters and their counts:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
        */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter any string : ");
        String input = scn.nextLine().toLowerCase();
        Map<Character, Integer> map = new HashMap<>(input.length());

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int value = map.get(ch) == null ? 0 : map.get(ch).intValue();
            if (ch != 0 || map.containsKey(ch)) {
                map.put(ch, ++value);
            }
        }

        System.out.println(map);
    }
}
