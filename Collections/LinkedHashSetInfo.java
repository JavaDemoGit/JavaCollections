/*
  LinkedHashSet ::
	============
		1. LinkedHashSet is a Collections framework collection available from java 1.4v and it is subclass of HashSet.
			 If we want to store unique objects in Insertion Order then we must use LinkedHashSet. Compared to  HashSet, LinkedHashSet execution is slow because it has to maintain insertion order.
		2. No, It is not synchronized collection.
		3. Yes, It is ordered collection. it is Inserion order but not indexed order
		4. HashSet and doubly linked backed by LinkedHashMap.
		5. Default capacity is 16, Increamental Capacity is double, load factor 75%.
		6. 3 types ( homo, hetero, unique ) of elements are allowed to store.
		7. null is allowed, only one null allowed.
		8. In Insertion Order, elements are preserved.
		9. In Sequential order only, elements are retrieved.
		10. hashCode() and equals() methods are called internally in collection.
 */

import java.util.LinkedHashSet;

public class LinkedHashSetInfo {
  
  public static void main(String[] args) {
    // The only difference is from HashSet to LinkedHashSet which maintains storing(Insertion Order) order.

    LinkedHashSet<Object> lhs = new LinkedHashSet<>();

    System.out.println("size: "+lhs.size());
		System.out.println("elements:  "+lhs);
		System.out.println();
		
		System.out.println(lhs.add("a"));
		System.out.println(lhs.add("b"));
		System.out.println(lhs.add(5));
		System.out.println(lhs.add("a"));
		System.out.println(lhs.add(new String("a")));
		System.out.println(lhs.add(5));
		System.out.println(lhs.add(Integer.valueOf(5)));
		System.out.println(lhs.add(null));				
		System.out.println(lhs.add(null));
		System.out.println(lhs.add(6.7));
		System.out.println(lhs.add("c"));
		System.out.println(lhs.add(4));
		System.out.println(lhs.add(5.3));
		System.out.println(lhs.add(true));
		System.out.println(lhs.add('d'));
		System.out.println(lhs.add('e'));
		System.out.println(lhs.add('f'));
		System.out.println(lhs.add("A"));
		System.out.println(lhs.add("B"));
		System.out.println();
		
		System.out.println("size: "+lhs.size());
		System.out.println("elements:  "+lhs);
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