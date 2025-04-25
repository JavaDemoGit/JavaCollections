/*
  LinkedList ::
	=========
		1. LinkedList is a collections framework collection, available from java 1.2 version. It is a implementation class of List interface. it is used to move 
		 		over collections in sequential order then we should use LinkedList.
		2. No, it is not synchronized collection.
		3. yes, it is ordered collection without index.( because it can store elements in nodes )
		4. Doubly linked list is the implemented data structure.
		5. Default capacity is zero, inremental capacity 1 , load factor 100%.
		6. all 4 types( homo, hetero, duplicate, unique objects) of  elements are allowed to store.
		7. null is allowed , multiple nulls are allowed.
		8. In Insertion order , elements are preserved.
		9. In Sequential order only, elements are retrieved.
		10. equals() method is called internally in Collection.
 */

import java.util.LinkedList;

public class LinkedListInfo{

  public static void main(String[] args) {
    /*
		 * When to choose LinkedList?
		 * If our more operations are insert and remove or moving from one element to another element sequentially then we use LinkedList.
		 * */

    LinkedList<Object> ll = new LinkedList<>();

    System.out.println("size:	"+ll.size());
		System.out.println("elements:	"+ll);
		System.out.println();
		
		
		ll.add("a");
		ll.add("b");
		ll.add(5);
		ll.add(null);
		ll.add(null);

		System.out.println("size:	"+ll.size());
		System.out.println("elements:	"+ll);
		System.out.println();

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