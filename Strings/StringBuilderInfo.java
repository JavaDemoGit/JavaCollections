public class StringBuilderInfo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World"); // Efficiently modifies the existing StringBuilder object
    System.out.println(sb); // Output: Hello World

    //StringBuilder methods
    System.out.println(sb.insert(5, ",")); // Output: Hello, World
    System.out.println(sb.replace(5, 6, " ")); // Output: Hello World
    System.out.println(sb.delete(5, 6)); // Output: HelloWorld
    System.out.println(sb.reverse()); // Output: dlroWolleH
    System.out.println(sb.length()); // Output: 11 (length of the string)
    System.out.println(sb.capacity()); // Output: 32 (default capacity is 16 + length of string)
    System.out.println(sb.reverse()); // Output: HelloWorld (reverses the string)
    System.out.println(sb.charAt(0)); // Output: H (character at index 0)
    System.out.println(sb.indexOf("o")); // Output: 4 (index of first occurrence of 'o')
    System.out.println(sb.lastIndexOf("o")); // Output: 7 (index of last occurrence of 'o')
    System.out.println(sb.substring(0, 5)); // Output: Hello (substring from index 0 to 5)
    System.out.println(sb.toString()); // Output: Hello World (converts StringBuilder to String)
    System.out.println(sb.equals("Hello")); // Output: false (StringBuilder is not equal to String)
    System.out.println(sb.compareTo(new StringBuilder("Hello"))); // Output: 6 (compares two StringBuilders)
    System.out.println(sb.compareTo(new StringBuilder("Hello World"))); // Output: 0 (compares two StringBuilders)
    System.out.println(sb.compareTo(new StringBuilder("HelloWorld"))); // Output: -55 (compares two StringBuilders)
    sb.delete(6, 11); // Removes "World" from the StringBuilder
    System.out.println(sb); // Output: Hello
    System.out.println();
  }
}

/*
 * StringBuilder
 * StringBuilder is a mutable sequence of characters. It is similar to
 * StringBuffer but is not synchronized, making it faster for single-threaded
 * operations. StringBuilder is used when you need to create or modify strings
 * frequently, such as in loops or when building strings dynamically. It allows
 * for efficient string manipulation without creating new objects each time.
 * StringBuilder is not thread-safe, so it should not be used in a multi-threaded
 * environment without proper synchronization.
 */

/*
 * StringBuilder:
 * StringBuilder is a mutable alternative to String. It allows for efficient
 * string manipulation, such as appending, inserting, or modifying characters
 * within the string, without creating new objects.
 * 
 * Pros:
 * - Mutable, making it suitable for building or modifying strings dynamically.
 * - Efficient for concatenating or manipulating strings in a loop or when
 * dealing with frequent modifications.
 * 
 * Cons:
 * - Not thread-safe. If used in a multi-threaded environment, additional
 * synchronization is required (use StringBuffer for thread safety).
 * 
 * Which to Choose:
 * - If you need to manipulate strings dynamically and thread safety is not a concern, StringBuilder is the preferred choice due to its efficiency.
 * - If you require thread safety, especially in a multi-threaded environment, use StringBuffer.
 * - Use String when you need an immutable string, and you don't anticipate frequent modifications.
 * 
 https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/
 https://www.javaguides.net/2023/08/string-vs-stringbuilder-vs-stringbuffer.html
 
 */