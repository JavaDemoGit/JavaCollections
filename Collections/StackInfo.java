/* 
  Stack ::
	=====
		1. Stack is subclass of  vector class, available from 1.0 version. It is used for retrieving objects in Last In First Out order
		2. Stack is the implemented data structure.
		3.Yes, it is synchronized collection
		4. Yes, it is ordered collection
		5. Default capacity is 10, Increamental capacity is double
		6. all 4 type (homo , hetero, duplicate, unique) of elements are allowed to store
		7. null is allowed, multiple nulls are allowed
		8. In insertion Order with index , elements are stored.
		9. In LIFO we can access but random access is also possible.
		10. equals() method is called internally in Collection.
*/

import java.util.Stack;

public class StackInfo {
  
  public static void main(String[] args) {
    /*
		 * When should we use Stack?
		 * If our target is retrieving objects in Last In First Out order then we should use Stack.
		 * */

     Stack<Object> s = new Stack<>();

     System.out.println("size :" + s.size());
     System.out.println("elements"+s);
     System.out.println();
     
     s.push("a"); // this method does adding element to method.
     s.push(2);
     s.push(5.5);
     s.push('c');
     s.push(true);
     s.push(null);
     s.push(null);
     s.push("b");
		 s.push("c");
		 s.push("d");
		 s.push("e");
     
     System.out.println("size :" + s.size());
     System.out.println("elements"+s);
     System.out.println();

     System.out.println(s.pop()); // this method will retrieve, remove and return.
     System.out.println(s);
     System.out.println(s.pop());
     System.out.println(s);
     System.out.println(s.pop());
     System.out.println(s);

     System.out.println();

     System.out.println(s.peek()); // this method retrieve, return but doesn't remove.
     System.out.println(s);
     System.out.println(s.peek());
     System.out.println(s);

     System.out.println(s.search("a")); //this method returns the position of the object not index.(according to LIFO it give its position)

     s.add("s");
     System.out.println(s);

     System.out.println(s.get(2));
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