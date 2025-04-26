/*
 ArrayList ::
 ===========
		1. ArrayList is a Collections framework collection, available from java 1.2 version. It is given as sub class or implementation class of List interface.
		 whenever we want to collect multiple objects with index in single thread model application and method local operations then we must use.
		2.	No, it is not synhchronized collection.
		3. Yes, it is ordered collection.
		4. Resizable array is the implemented data structure.
		5. The default capacity is 10, and the incremental capacity half, the load factor is 75%.
		6. all 4 types ( homo , hetero, duplicate, unique objects) of elements are allowed to store.
		7. null is allowed, mutliple nulls are allowed because duplicates are allowed.
		8. In Insertion order with index, elements are preserved
		9. In Random and Sequential elements are retrieved.
		10. equals() method is called internally in collection.
 */

import java.util.ArrayList;

public class ArrayListInfo {
  
  public static void main(String[] args) {
    
    ArrayList<Object> al = new ArrayList<>();
    /*
     * When should we choose ArrayList?
		 * If we want to store objects in single thread environment and for method local operations then use it as vector gives less performance because of multi-thread
     */

    System.out.println("size: "+al.size());
    System.out.println("elements: "+al);
    System.out.println();
    
    al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add('p');
		al.add(true);
		al.add("a");
		al.add(5);
		al.add(6.7);
		al.add('p');

    System.out.println("size: "+al.size());
    System.out.println("elements: "+al);
    System.out.println();

    al.add(true);
		al.add(null);
		al.add(null);
		
		System.out.println("size:	"+al.size());
		System.out.println("elements:	"+al);
		System.out.println();

		ArrayList<Object>	al2 = new ArrayList<>();
		al2.add("a");
		al2.add("b");
		al2.add(5);
		al2.add(new Example(5,6));
		
		ArrayList<Object>	al3 = new ArrayList<>();
		al3.add(true);
		al3.add(6.7);
		al3.add(al2);			// Here elements of al2 are not copied instead the al1 reference is stored.
		al3.addAll(al2);
		
		System.out.println(al2);
		System.out.println(al3);
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