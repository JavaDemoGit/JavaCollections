public class StringBuilderInfo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World"); // Efficiently modifies the existing StringBuilder object
  }
}

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