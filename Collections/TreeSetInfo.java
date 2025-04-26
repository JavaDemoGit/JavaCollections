import java.util.TreeSet;

public class TreeSetInfo {
  public static void main(String[] args) {
    /*
		 * When should we use TreeSet?
		 * If we want to store objects in sorting order then we must use TreeSet.
		 * */
    TreeSet<String> ts1 = new TreeSet<>();
    ts1.add("a");
    ts1.add("c");
    ts1.add("b");
    System.out.println(ts1);
    System.out.println();

  }
}

/*
  Working with TreeSet and TreeMap  classes & Comparable and Comparator interfaces ::
	  If we want to store objects in sorting order we must use TreeSet and TreeMap.
		  
		TreeSet stores objects in sorting order either in ascending order (or) in descending order (or) insertion order(or) reverse insertion order based on the
		adding objects given algorithm.
		 
		TreeSet does not have default sorting order.
		 
		The sorting order should be defined by the application programmer, in the class whose objects are adding to TreeSet.
		  
		So the default sorting order of TS is the default sorting order of the objects those are adding to TreeSet.
		 
		For Storing objects in sorting order, 
		TreeSet Internally uses either of the below two interfaces
		 	1. Comparable 	or
		 	2. comparator
		 
		Comparable<T> interface has below method
		   		public int compareTo(Object o1, Object o2)
		   		- It is used for providing default sorting logic
		  
		Comparator<T> interface has below method
		  		public int compare(Object o1, Object o2)
		 			- it is used for providing custom logic.
		  
		TS uses these two interfaces, because through interface we can force subclass programmer to implement a method logic.
		
		TS requires the sorting order logic that must be provided by adding object class programmer, the objects sorting order logic will be changed from one
		type of object to another type of object.
		
		Therefore to force adding object class programmer to implementing sorting order logic, TS uses interfaces.
		
		We must override compareTo() and compare() methods with the logic to return an int value either  0/+ve/-ve
		 1. If we return 0, second object will not be stored because TS will consider it as duplicate object.
		 2.If we return +ve value, second object will be stored 
				RIGHT to first object, because
	 			TS will consider it as Bigger object
			
		 3. If we return -ve value, second object will be stored
		  		LEFT to first object, because
		  		TS will consider it as Smaller Object.
		
	  TS.add() method internally calls these interfaces methods, and those methods are executed from adding object class.
		 
		Then based on the value returned from these methods, 
		TS will sort objects as below
		 - If returned value is 0 , 
		 	object e2 is not added.
		 
		 - If returned value is -ve, 
		 	object e2 is added LEFT to TS element e1.
		
		 - If returned value is +ve,
		 	object e2 is added RIGHT to TS element e1.
		 
		
		
		What is the meaning of natural sorting order and custom sorting order?
		
		The sorting order logic is that is implemented in adding object class by deriving the Comparable
		interfaces is called natural sorting order.
		
		The sorting order logic that is implemented in different class by deriving the comparator interface is called custom sorting order logic.
		
		We will implement custom sorting order logic in different class, but not in adding object's class.
 */