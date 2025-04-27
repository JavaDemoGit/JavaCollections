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
    System.out.println("String after converting to StringJoiner: " + new java.util.StringJoiner(", ").add(str));
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
 * - If you need to manipulate strings dynamically and thread safety is not a
 * concern, StringBuilder is the preferred choice due to its efficiency.
 * - If you require thread safety, especially in a multi-threaded environment,
 * use StringBuffer.
 * - Use String when you need an immutable string, and you don't anticipate
 * frequent modifications.
 */