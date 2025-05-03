import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String input = scn.nextLine();
        int vowelCount = 0;
        for(char ch : input.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                vowelCount++;
            }
        }
        System.out.println("Number of vowels : "+vowelCount);
    }
}
// This program counts the number of vowels in a given string. It converts the string to lowercase and iterates through each character, checking if it is a vowel (a, e, i, o, u). The count of vowels is then printed.
// The program uses a simple loop and the indexOf method to check for vowels. It is efficient and easy to understand, making it suitable for beginners.
// The program can be further improved by using a Set to store the vowels, which would make the lookup operation more efficient. However, for small strings, the current implementation is sufficient.
// The program is a good example of string manipulation and character checking in Java. It demonstrates the use of loops, conditionals, and string methods, making it a useful exercise for those learning Java programming.