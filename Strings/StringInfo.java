import java.io.IOException;
import java.io.StringWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringInfo {
  public static void main(String[] args) {
    String str = "Hello";
    str = str + " World"; // This creates a new string object

    /*
     * The class String includes methods for examining individual characters of the
     * sequence,
     * for comparing strings, for searching strings, for extracting substrings,
     * and for creating a copy of a string with all characters translated to
     * uppercase or to lowercase.
     * The class String also includes methods for converting other types (such as
     * int) to strings,
     * and for converting strings to arrays of characters.
     */
    // Example of String methods
    System.out.println("Original String: " + str);
    System.out.println("Length: " + str.length());
    System.out.println("Character at index 1: " + str.charAt(1));
    System.out.println("Substring (0, 5): " + str.substring(0, 5));
    System.out.println("Index of 'o': " + str.indexOf('o'));
    System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
    System.out.println("String in bytes: " + str.getBytes());
    System.out.println();

    System.out.println("String in uppercase: " + str.toUpperCase());
    System.out.println("String in lowercase: " + str.toLowerCase());
    System.out.println();

    System.out.println("String contains 'World': " + str.contains("World"));
    System.out.println("String starts with 'Hello': " + str.startsWith("Hello"));
    System.out.println("String ends with 'World': " + str.endsWith("World"));
    System.out.println();

    System.out.println("String equals 'Hello World': " + str.equals("Hello World"));
    System.out.println("String equalsIgnoreCase 'hello world': " + str.equalsIgnoreCase("hello world"));
    System.out.println();

    //compareTo
    //compareTo method returns 0 if the string is equal to the other string. 
    //A value less than 0 is returned if the string is less than the other string (less characters) 
    //and a value greater than 0 if the string is greater than the other string (more characters).
    System.out.println("String compareTo 'Hello': " + str.compareTo("Hello"));
    System.out.println("String compareToIgnoreCase 'hello': " + str.compareToIgnoreCase("hello"));
    System.out.println();

    // contentEquals
    /* 
     - contentEquals method compares the string with the specified character sequence.
     - The contentEquals() method is useful when you need to compare a String with a CharSequence or StringBuffer directly,
       avoiding the overhead of converting them to String objects first. 
     - When comparing two String objects, it's generally recommended to use the equals() method, 
       which is specifically designed for String comparisons.
    */
    System.out.println("String contentEquals 'Hello World': " + str.contentEquals("Hello World"));
    System.out.println("String contentEquals 'Hello': " + str.contentEquals("Hello"));
    System.out.println();


    //hashCode
    /*
     - The hashCode() method returns an integer value, which is the hash code of the string.
     - The hash code is used to identify the string in hash tables and other data structures.
     - The hashCode() method is useful when you need to store or retrieve strings from hash-based collections like HashMap or HashSet.
    */
    System.out.println("String hashCode: " + str.hashCode());
    System.out.println("String hashCode 'Hello World': " + "Hello World".hashCode());
    System.out.println("String hashCode 'Hello': " + "Hello".hashCode());
    System.out.println();

    //Strip 
    /*
     - The strip() method removes leading and trailing whitespace from the string.
     - The strip() method is useful when you need to clean up user input or remove unnecessary spaces from a string.
     - The strip() method is more efficient than the trim() method, as it uses Unicode-aware whitespace removal.
    */
    System.out.println("String after stripping: " + str.strip());
    System.out.println("String after stripping 'Hello World': " + "   Hello World   ".strip());
    System.out.println("String after stripping 'Hello': " + "   Hello".stripLeading());
    System.out.println("String after stripping 'World': " + "World   ".stripTrailing());
    System.out.println();
    
  
    System.out.println("String after replacing 'World' with 'Java': " + str.replace("World", "Java"));
    System.out.println("String split by space: " + String.join(", ", str.split(" ")));
    System.out.println("String after trimming: " + str.trim());
    System.out.println("String after concatenation: " + str.concat("!"));
    System.out.println("String after formatting: " + String.format("Formatted String: %s", str));
    System.out.println();

    System.out.println("String after converting to char array: " + String.valueOf(str.toCharArray()));
    System.out.println("String after converting to byte array: " + new String(str.getBytes()));
    System.out.println();

    // Converting String to other types
    System.out.println("String after converting to int: " + Integer.parseInt("123"));
    System.out.println("String after converting to double: " + Double.parseDouble("123.45"));
    System.out.println("String after converting to boolean: " + Boolean.parseBoolean("true"));
    System.out.println("String after converting to float: " + Float.parseFloat("123.45"));
    System.out.println("String after converting to long: " + Long.parseLong("123456789"));
    System.out.println("String after converting to short: " + Short.parseShort("12345"));
    System.out.println("String after converting to byte: " + Byte.parseByte("123"));
    System.out.println();

    // Converting other types to String
    System.out.println("int to String: " + String.valueOf(123));
    System.out.println("double to String: " + String.valueOf(123.45));
    System.out.println("boolean to String: " + String.valueOf(true));
    System.out.println("float to String: " + String.valueOf(123.45f));
    System.out.println("long to String: " + String.valueOf(123456789L));
    System.out.println("short to String: " + String.valueOf((short) 12345));
    System.out.println("byte to String: " + String.valueOf((byte) 123));
    System.out.println("char to String: " + String.valueOf('A'));
    System.out.println();

    // Converting String to other classes
    System.out.println("String after converting to StringBuilder: " + new StringBuilder(str));
    System.out.println("String after converting to StringBuffer: " + new StringBuffer(str));
    System.out.println("String after converting to StringTokenizer: " + new java.util.StringTokenizer(str));
    System.out.println("String after converting to StringJoiner: " + new java.util.StringJoiner(", ").add(str).add("java"));
    System.out.println("String after converting to StringWriter: " + new java.io.StringWriter().append(str));
    System.out.println("String after converting to StringReader: " + new java.io.StringReader(str));
    System.out.println();

    System.out.println("String after converting to BigInteger: " + new java.math.BigInteger("12345678901234567890"));
    System.out.println("String after converting to BigDecimal: " + new java.math.BigDecimal("12345.67890"));
    System.out.println();

    String s = "This is a sample string";
    StringTokenizer tokenizer = new StringTokenizer(s);

    while (tokenizer.hasMoreTokens()) {
      System.out.println(tokenizer.nextToken());
    }
    System.out.println();

    StringJoiner sj1 = new StringJoiner(", ");
    sj1.add("Apple");
    sj1.add("Banana");
    sj1.add("Cherry");
    System.out.println(sj1.toString()); // Output: Apple, Banana, Cherry

    StringJoiner sj2 = new StringJoiner(", ", "[", "]");
    sj2.add("Dog");
    sj2.add("Cat");
    sj2.add("Elephant");
    System.out.println(sj2.toString()); // Output: [Dog, Cat, Elephant]

    StringJoiner sj3 = new StringJoiner(", ", "{", "}");
    System.out.println(sj3.toString()); // Output: {}

    System.out.println();

    StringWriter stringWriter = new StringWriter();
    try {
      stringWriter.write("Hello, ");
      stringWriter.write("World!");
      stringWriter.append(" Appended text.");

      String result = stringWriter.toString();
      System.out.println(result); // Output: Hello, World! Appended text.

      stringWriter.close();
    } catch (IOException e) {
      e.printStackTrace(); // No IOException will be thrown, but it's good practice to include the
                           // try-catch block.
    }

    System.out.println();
    
  }
}
/*
 * String memory allocation: 
 * In Java, strings are stored in a special area of memory called the
 * "string pool." When a string is created, Java checks the string pool to see if
 * an identical string already exists. If it does, Java reuses the existing string
 * instead of creating a new one. This helps save memory and improves performance.
 * String pool is a part of the heap memory where Java stores string literals.
 * When a string is created using double quotes (e.g., String str = "Hello";),
 * it is stored in the string pool.
 * When a string is created using the new keyword (e.g., String str = new
 * String("Hello");), it is stored in the heap memory, and a new object is
 * created.
 * String literals are interned, meaning they are stored in the string pool,
 * while strings created with the new keyword are not interned.
 * String literals are immutable, meaning their values cannot be changed once
 * created. Any modification to a string literal creates a new string object.
 * String objects created with the new keyword are mutable, meaning their
 * values can be changed. However, this is not recommended as it can lead to
 * memory leaks and performance issues.
 * String literals are stored in the string pool, which is a part of the heap
 * memory. This allows for efficient memory usage and faster access to string
 * literals.
 */
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
 * - If you need to manipulate strings dynamically and thread safety is not a
 * concern, StringBuilder is the preferred choice due to its efficiency.
 * - If you require thread safety, especially in a multi-threaded environment,
 * use StringBuffer.
 * - Use String when you need an immutable string, and you don't anticipate
 * frequent modifications.
 */