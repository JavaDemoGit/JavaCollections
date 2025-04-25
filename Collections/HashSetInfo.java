/*
  HashSet ::
	=======
		1. HashSet is a Collections framework collection. it is subtype of  Set, available from java 1.2v. 
			If we want to store unique objects without worrying about storing order then we must use HashSet and we can use this for mutli threaded and method local operations
		2. No, it is not Synchronized 
		3. No, it is not Ordered collection
		4. Hash table is the implemented data structure.
		5. Default capacity is 16, Increamental capacity is double , load factor 75%
		6. 3 types( homo, hetero, unique) of elements are allowed to store.
		7. null is allowed , only one null is allowed.
		8. In hash code order , elements are preserved.
		9. In Sequential order only, elements are retrived. random order is not supported.
		10. hashCode() and equals() methods are called in collections internally.
 */

import java.util.HashSet;

public class HashSetInfo {
  
  public static void main(String[] args) {
    HashSet<Object> hs = new HashSet<>();

    System.out.println("size: "+hs.size());
		System.out.println("elements:  "+hs);
		System.out.println();


    System.out.println(hs.add("a"));
    System.out.println(hs.add("b"));
    System.out.println(hs.add(5));
    System.out.println(hs.add("a")); //duplicates are not allowed and they are replaced
    System.out.println(hs.add(new String("a"))); //this is also duplicate
    System.out.println(hs.add(5));
    //hs.add(new Integer(5));
    System.out.println(hs.add(Integer.valueOf(5)));
    hs.add(null);  //HashSet doesn't maintain storing order. In hashcode order elements are preserved.
    hs.add(null); 
    hs.add(6.7);
    hs.add("c");
    hs.add(4);
    hs.add(5.3);
    hs.add(true);
    hs.add('d');
    hs.add('e');
    hs.add('a');

		System.out.println();
    System.out.println("size: "+hs.size());
		System.out.println("elements:  "+hs);
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

//1) hierarchy													//Iterable
													//Collection
										//Set
								// SS
							// NS
																				//AC
																	//AS

//TS			//HS				//ES
			
													//LHS

//2. If you want to store unique(ref wise or data wise)(by default ref wise dups are stopped) objects then you must use set implemented classes.
//3. Set has 4 implemented classes ::   HS, LHS, ES, TS(is sub type of SortedSet).
//4. All set implemented classes are not indexed.
//5. Because they are not indexed, by default retrieving order is sequential only, random is not supported.
//6. If you choose HS, LHS , they are ready to store 3 types of objects(Homo, hetero, unique), by default ref wise duplicates are not allowed but if you want data
//		wise also you override equals() method.
//7. If you take enum set only named constants are allowed, 
//		null is not allowed ----> NPE
//8. If you take TreeSet, only homogeneous objects are allowed ---> one class objects(can store heterogeneous and duplicate also),
//		null is not allowed  ---> NPE
//9. HS and LHS --> we must override hashCode() and equals() methods otherwise data wise duplicates are stored.
//10.  TS --> We must override Comparable.compareTo(-) or Comparator.compare(-,-) else we get ClassCastException
//11. If we override comparTo() and compare() wrongly,
//			TS is meant for storing only homogeneous objects in sorting  order but no guarantee,
//			but it can store hetero and duplicate objects in Insertion Order, Reverse Insertion Order, Ascending Order, Descending Order
//			It is all depending on Comparable.compareTo(-) and Comparator.compare(-,-) method implementation.
//
//
//12. Default Capacity and Increamental Capacity and LoadFactor(Fill ratio)
//			HS -> 16		--> double		--> 75%
//			LHS -> 16	--> double		--> 75%
//			TS -> 0			--> 1					--> not applicable
//			ES -> ??		--> ?					--> not applicable
//
//13. Implemented data Structure :;
//		HS  ==>  hash table  backed by hashMap instance.
//		LHS  ==>  hash table + doubly linked list
//		TS  ==>  Red-Black balanced Tree
//		ES  ==>  hash table
//
//14. In HS, constructors are
// 			HashSet()
//			HashSet(Collection)
//			HashSet(int initialCap)
//			HashSet(int initialCap, double loadFactor)
//
