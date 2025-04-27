public class StringBufferInfo {
  public static void main(String[] args) {  
    StringBuffer buffer = new StringBuffer("Hello");
    System.out.println(buffer.capacity()); // Output: 16 (default capacity is 16)
    buffer.append(" World"); // Efficiently modifies the existing StringBuffer object
    System.out.println(buffer); // Output: Hello World

    /* 
    // StringBuffer is thread-safe
    // Multiple threads can safely use a StringBuffer without data corruption
    // Example of thread safety
    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        buffer.append("A");
      }
    });
    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        buffer.append("B");
      }
    });
    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(buffer); // Output: Hi WorldAAAAABBBBB
    System.out.println();
    */

    //Example StringBuffer methods
    System.out.println(buffer.insert(5, ",")); // Output: Hello, World
    System.out.println(buffer.replace(5, 6, " ")); // Output: Hello World
    System.out.println(buffer.delete(5, 6)); // Output: HelloWorld
    System.out.println(buffer.reverse()); // Output: dlroWolleH
    System.out.println(buffer.length()); // Output: 11 (length of the string)
    System.out.println(buffer.capacity()); // Output: 32 (default capacity is 16 + length of string)
    System.out.println(buffer.reverse()); // Output: HelloWorld (reverses the string)
    System.out.println();

    System.out.println(buffer.charAt(0)); // Output: H (character at index 0)
    System.out.println(buffer.indexOf("o")); // Output: 4 (index of first occurrence of 'o')
    System.out.println(buffer.lastIndexOf("o")); // Output: 7 (index of last occurrence of 'o')
    System.out.println(buffer.substring(0, 5)); // Output: Hello (substring from index 0 to 5)
    System.out.println(buffer.toString()); // Output: Hello World (converts StringBuffer to String)
    System.out.println();

    System.out.println(buffer.equals("Hello")); // Output: false (StringBuffer is not equal to String)
    System.out.println(buffer.compareTo(new StringBuffer("Hello"))); // Output: 6 (compares two StringBuffers)
    System.out.println(buffer.compareTo(new StringBuffer("Hello World"))); // Output: 0 (compares two StringBuffers)
    System.out.println(buffer.compareTo(new StringBuffer("HelloWorld"))); // Output: -55 (compares two StringBuffers)
    buffer.delete(6, 11); // Removes "World" from the StringBuffer
    System.out.println();

    System.out.println(buffer.append(" World")); // Output: Hello World
    System.out.println(buffer.insert(5, ",")); // Output: Hello, World
    System.out.println(buffer.replace(5, 6, " ")); // Output: Hello World
    System.out.println(buffer.delete(5, 6)); // Output: HelloWorld
    System.out.println();

    //append() method
    StringBuffer buffer1 = new StringBuffer("Hello");
    System.out.println(buffer1.append(" World")); // Output: Hello World
    System.out.println(buffer1.append("!")); // Appends "!" to the existing StringBuffer
    System.out.println(buffer1.append(123)); // Output: Hello World!123
    System.out.println(buffer1.append(123.45f)); // Appends the float 123.45 to the existing StringBuffer
    System.out.println(buffer1.append(true)); // Output: Hello World!123true
    System.out.println(buffer1.append(45.67)); // Output: Hello World!123true45.67
    System.out.println(buffer1.append('A')); // Output: Hello World!123true45.67A
    System.out.println(buffer1.append(new char[] {'B', 'C', 'D'})); // Output: Hello World!123true45.67ABCD
    buffer1.append("XYZ", 1, 3); // Appends the substring "YZ" from "XYZ" to the existing StringBuffer
    System.out.println(buffer1); // Output: Hello World!123true45.67ABCDXY
    System.out.println();

    //insert() method
    StringBuffer buffer2 = new StringBuffer("Hello");
    System.out.println(buffer2.insert(5, " World")); // Output: Hello World
    System.out.println(buffer2.insert(0, "Greetings! ")); // Output: Greetings! Hello World
    System.out.println(buffer2.insert(7, "Beautiful ")); // Output: Greetings! Hello Beautiful World
    System.out.println(buffer2.insert(5, "Amazing ")); // Output: Greetings! Hello Amazing Beautiful World
    System.out.println(buffer2.insert(0, 123)); // Output: 123Greetings! Hello Amazing Beautiful World
    System.out.println(buffer2.insert(0, 123.45f)); // Output: 123.45Greetings! Hello Amazing Beautiful World
    System.out.println(buffer2.insert(0, true)); // Output: true123.45Greetings! Hello Amazing Beautiful World
    System.out.println(buffer2.insert(0, 'A')); // Output: Atrue123.45Greetings! Hello Amazing Beautiful World
    System.out.println(buffer2.insert(0, new char[] {'B', 'C', 'D'})); // Output: BCDtrue123.45Greetings! Hello Amazing Beautiful World
    System.out.println(buffer2.insert(0, "XYZ", 1, 3)); // Output: YZBCDtrue123.45Greetings! Hello Amazing Beautiful World
    System.out.println(buffer2); // Output: YZBCDtrue123.45Greetings! Hello Amazing Beautiful World
    System.out.println();


  }
}

/*
 * StringBuffer:
 * -> StringBuffer is a mutable sequence of characters, allowing for dynamic
 * string manipulation. It is part of the java.lang package and provides
 * methods for appending, inserting, deleting, and modifying strings. StringBuffer
 * is synchronized, making it thread-safe, which means multiple threads can
 * safely use a StringBuffer without the risk of data corruption. It is
 * generally used in multi-threaded applications where thread safety is a
 * concern. StringBuffer is less efficient than StringBuilder due to the overhead of
 * synchronization, but it is still a good choice when you need to manipulate
 * strings in a thread-safe manner. StringBuffer is also used when you need to
 * perform frequent modifications to a string, such as appending or inserting
 * characters. It is important to note that StringBuffer is not as widely used
 * as StringBuilder, as most applications do not require thread safety for string
 * manipulation. However, it is still a valuable tool in the Java programming
 * language for specific use cases.
 */

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