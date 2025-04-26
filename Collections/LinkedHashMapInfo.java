/*
  LinkedHashMap ::
	=============
		1. LinkedHashMap is a Collections framework collection available from java 1.2v, it is an implementation of Map interface. If want to  store objects with mappings
		 in Insertion order then we must use LinkedHashMap. 
		2. No, It is not Synchronized collection.
		3. Yes, It is ordered collection
		4. Hashtable+doubly Linkedlist is the implemented data structure.
		5. Default capacity is 16, increamental capacity is double, load factory is 0.75.
		6. key --> homo, hetero, unique			If we pass duplicate  key old value is replaced
		   value --> all 4 types.
		7.  key ---> only one null is allowed
		 		value --> multiple nulls are allowed.
		8. Insertion order is maintained to store.
		9. key is sequential but value is random.
		10. On key object , hashCode() and equals() methods are called.
 */

import java.util.LinkedHashMap;

public class LinkedHashMapInfo{

  public static void main(String[] args) {
    
    LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();

    System.out.println("size: "+lhm.size());
		System.out.println("elements:	"+lhm); 
		System.out.println();

    System.out.println(lhm.put("a", 97));
    System.out.println(lhm.put("b", 98));
    System.out.println(lhm.put("c", null));
    System.out.println(lhm.put("c", 99));
    System.out.println(lhm.put("b", 100));
    System.out.println(lhm.put(5, "d"));
    System.out.println(lhm.put(true, "e"));
    System.out.println(lhm.put(null, "f"));
		System.out.println();

    System.out.println("size: "+lhm.size());
		System.out.println("elements:	"+lhm); 
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