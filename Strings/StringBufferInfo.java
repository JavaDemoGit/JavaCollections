public class StringBufferInfo {
  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer("Hello");
    buffer.append(" World"); // Efficiently modifies the existing StringBuffer object

  }
}

/*
 * StringBuffer:
 * -> StringBuffer is similar to StringBuilder in terms of mutability and
 * efficient string manipulation. However, it is thread-safe, meaning multiple
 * threads can safely use a StringBuffer without the risk of data corruption.
 * 
 * Pros:
 * - Mutable and thread-safe, making it suitable for multi-threaded
 * applications.
 * - Efficient for concatenating or modifying strings when thread safety is
 * required.
 * 
 * Cons:
 * - Slightly less efficient than StringBuilder due to thread safety overhead.
 * - It's generally recommended for multi-threaded scenarios.
 * 
 * 
 * Which to Choose:
 * - If you need to manipulate strings dynamically and thread safety is not a concern, StringBuilder is the preferred choice due to its efficiency.
 * - If you require thread safety, especially in a multi-threaded environment, use StringBuffer.
 * - Use String when you need an immutable string, and you don't anticipate frequent modifications.
 * 
 */