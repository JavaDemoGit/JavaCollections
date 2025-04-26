public class StringInfo {
  public static void main(String[] args) {
    String str = "Hello";
    str = str + " World"; // This creates a new string object
  }
}

/*
 * String:
 * String in Java represents an immutable sequence of characters. Once a String
 * object is created, its content cannot be changed. Any operation that appears
 * to modify a String actually creates a new String object.
 * 
 * Pros:
 * - Thread-safe (immutable), making it suitable for use in multi-threaded
 * environments.
 * - Predictable behavior in terms of memory usage.
 * 
 * Cons:
 * - Inefficient for frequent string manipulation, as it creates new objects
 * with each modification, leading to performance overhead.
 * 
 * Which to Choose:
 * - If you need to manipulate strings dynamically and thread safety is not a concern, StringBuilder is the preferred choice due to its efficiency.
 * - If you require thread safety, especially in a multi-threaded environment, use StringBuffer.
 * - Use String when you need an immutable string, and you don't anticipate frequent modifications.
 */