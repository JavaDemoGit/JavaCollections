import java.util.ArrayList;

public class AllOperations {
  public static void main(String[] args) {
    // creating collection
    ArrayList<Object> al = new ArrayList<>();

    // 1. checking whether collection is empty or not
    System.out.println(al.isEmpty());

    // 2. couting number of elements in collection
    System.out.println(al.size());

    // 3. displaying elements
    System.out.println("elements : " + al);
    System.out.println();

    // 4. Adding all 4 types of objects
    al.add("a");
    al.add("b");
    al.add(5);
    al.add(6.7);
    al.add(true);
    al.add(null);
    al.add(new Example(5, 6));
    al.add('b');
    al.add("a");
    al.add(new Example(5, 6));
    al.add(5);
    al.add(10);
    al.add(null);
    al.add(11);
    al.add(12);

    System.out.println("size:	" + al.size());
    System.out.println("elements:	" + al);
    System.out.println(al.isEmpty());

    // 5. retrieving one element from collection
    Object object = al.get(4);
    System.out.println(object);
    System.out.println();

    Boolean bool = (Boolean) object;
    System.out.println(bool);

    Object object2 = al.get(7);
    System.out.println(object2);

    if (object2 instanceof Character) {
      Character ch = (Character) object2;
      System.out.println(ch);
    }

    // System.out.println(al.get(-1)); // throws java.lang.IndexOutOfBoundsException

    // To print multiple objects
    for (int i = 0; i < al.size(); i++) {
      System.out.println(al.get(i));
    }
    System.out.println();

    // Display all String objects in upper case and remaining elements in lower case
    for (int i = 0; i < al.size(); i++) {
      Object object3 = al.get(i);
      if (object3 instanceof String)
        System.out.println(((String) object3).toUpperCase());
      else
        System.out.println(object3);
    }
    System.out.println();
    System.out.println();

    // retrieving objects by using enhanced for loop or for-each loop
    for (Object obj : al) {
      if (obj instanceof String)
        System.out.println(((String) obj).toUpperCase());
      else
        System.out.println(obj);
    }

    System.out.println(al.contains("a"));
    System.out.println(al.contains(5));
    System.out.println(al.contains("A"));
    System.out.println(al.contains('b'));
    System.out.println();

    //7. finding the index of the given object(first occurance)
    System.out.println(al.indexOf("a"));
    System.out.println(al.indexOf(5));
		System.out.println(al.indexOf("A"));
		System.out.println(al.indexOf('b'));
		System.out.println(al.indexOf("b"));
		System.out.println();

    //8. finding the index of the given object(last occurance)
    System.out.println(al.lastIndexOf("a"));
		System.out.println(al.lastIndexOf(5));
		System.out.println(al.lastIndexOf("A"));
		System.out.println(al.lastIndexOf('b'));
		System.out.println(al.lastIndexOf("b"));
		System.out.println();

    //9. Removing given element from this collection
		// public boolean remove(Object obj)	------> from Collection
		// public Object remove(int index)		------>  from List
    System.out.println(al);
    System.out.println(al.remove(5));		// remove(index) // remove method removes 5th index element
		System.out.println(al);
		System.out.println(al.remove((Integer)5));			// remove(object)
		System.out.println(al);
		//System.out.println(al.remove('b'));
		System.out.println(al.remove((Character)'b'));		// remove(object)
		System.out.println(al);
		System.out.println(al.remove("a"));
		System.out.println(al);
		System.out.println(al.remove(6.7));
		System.out.println(al);
		System.out.println(al.remove(true));
		System.out.println(al);
		System.out.println(al.remove(null));
		System.out.println(al);

    ArrayList<Integer> al2 = new ArrayList<>();
		for(int i = 0;i<= 10; i++) {
			al2.add(i*10);
		}
		System.out.println(al2);
		System.out.println(al2.remove(1));
		System.out.println(al2.remove(2));
		System.out.println(al2.remove(3));
		System.out.println(al2);

    ArrayList<Object>	al3 = new ArrayList<>();
		al3.add("a");
		al3.add(5);
		al3.add(6.7);
		al3.add(null);
		al3.add(new Example(5,6));
		
		System.out.println(al3);
		System.out.println(al3.remove("a"));
		System.out.println(al3);
		System.out.println();

    //10. Replacing given index location element with element
		// public Object set(int index, Object obj)
		System.out.println(al3.set(1, "A"));
		System.out.println(al3);
		
		//12. Inserting given element in given index location
		// public boolean add(int index, Object obj)
		System.out.println(al3.size());
		al3.add(2,'Y');
		System.out.println(al3);
		al3.add(4,"Z");
		System.out.println(al3);
		System.out.println(al3.size());
		al3.add(6,"W");
		System.out.println(al3);

    ArrayList<String>  al4 = new ArrayList<>();
		al4.add("a");
		al4.add("c");
		al4.add("b");
		System.out.println(al4);
    //Collections.sort(al4); // upto 1.7v
    al4.sort(null); // natural ordering should be used when null is provided.
    System.out.println(al4);

  }
}