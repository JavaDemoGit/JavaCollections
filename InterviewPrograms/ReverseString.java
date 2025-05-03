import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter any String : ");
        String inpuString = scn.nextLine();
        String reverseString = "";
        for (int i = inpuString.length() - 1; i >= 0; i--) {
            reverseString += inpuString.charAt(i);
        }
        System.out.println(reverseString);
        System.out.println();
        System.out.println();

        // Reverse Order of Words.
        String[] words = inpuString.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
