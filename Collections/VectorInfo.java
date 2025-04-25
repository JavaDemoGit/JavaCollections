/*
Vector ::
		1. Vector is legacy collection and it was given in java 1.0 version. It is used for storing multiple objects in Insertion order in multi-threaded environment
		 with thread safety.
		2.	It is synchronized collection.
		3.	It is ordered collection.
		4.	the implemented data structure is growable array.
		5.	the default capacity is 10, incremental capacity is double, load factor is 100% ( simply load factor tells how much filling capacity is required to grow its size).
		6. all 4 types of elements( homo, hetero, duplicate, unique ) are allowed to store.
		7. null is allowed, multiple nulls are allowed because duplicates are allowed.
		8. In Insertion order elements are stored
		9. Elements are retrieved in random access as well as sequentially.
		10. equals() method is called internally when searching and removing operations are called.
*/

import java.util.Vector;

public class VectorInfo{

  public static void main(String[] args) {
    Vector<Object> v = new Vector<>();
    System.out.println("Capacity : "+v.capacity());
    System.out.println("size : "+v.size());
    System.out.println("elements : "+v);
    
    v.add("a");
    v.add("b");
    v.add(5);
    v.add(6.7);
    v.add('p');
    v.add(true);
    v.add("a");
    v.add(5);
    v.add(6.7);
    v.add(true);
    v.add(null);
    v.add(null); // add method has return type boolean

    v.addElement(false);  // addElement method has return type void

    v.add(1, "one"); // insert element at particular index
    
    System.out.println();
    System.out.println("Capacity : "+v.capacity());
    System.out.println("size : "+v.size());
    System.out.println("elements : "+v);
    
    v.clear();
    System.out.println();
    System.out.println("Capacity : "+v.capacity());
    System.out.println("size : "+v.size());

  }
}

/*
Common interview questions asking on every collection ::
		==========================================
		1.	What is this collection and use of it?
		2.	Is it synchronized(thread-safe)?
		3. Is it an ordered collection?
		4. What is the implemented data structure?
		5. What is the default capacity and incremental capacity, load factor ?
		6. What type of elements are allowed to store?
		7.	Is null allowed, if so how many?
		8. In which order elements are preserved?
		9. In which order elements are retrieved?
		10. Internal Methods calling in collection and executing from our adding object class?
*/