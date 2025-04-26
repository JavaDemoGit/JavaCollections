import java.util.ArrayList;
import java.util.LinkedList;

public class BulkOperations {
  public static void main(String[] args) {
    // public boolean addAll(Collection)							----> Union
		// public boolean containsAll(Collection)					----> Subset
		// public boolean removeAll(Collection)						----> Remove(-)
		// public boolean retainAll(Collection)						----> intersection

    ArrayList<Object>	al1 = new ArrayList<>();
		al1.add("a");
		al1.add("b");
		al1.add("b");
		al1.add("c");
		al1.add(5);
		al1.add(new Example(5,6));
		al1.add(new Example(5,6));
		System.out.println(al1);

    //union operations
    ArrayList<Object> al2 = new ArrayList<>(al1);
    System.out.println(al2);

    ArrayList<Object> al3 = new ArrayList<>();
    al3.addAll(al1);
    System.out.println(al3);

    al2.add(6.7);
		al2.add(true);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println();

    ArrayList<Object>	al4 = new  ArrayList<>();
		al4.add("b");
		al4.add(7L);
		
		// sub set
    System.out.println(al1.containsAll(al2));
    System.out.println(al2.containsAll(al1));
    System.out.println(al1.containsAll(al4));
    System.out.println();

    // remove(-)
		//System.out.println(al1.removeAll(al2));
		//System.out.println(al2.removeAll(al1));		// all al1 elements are removed  from al2
		//System.out.println(al1.removeAll(al4));
		System.out.println(al1);
		System.out.println(al2);
		System.out.println();

    // intersection
		al1.retainAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println();
		
		al2.retainAll(al1);				// Except al1 elements, remaining elements are removed
		System.out.println(al1);
		System.out.println(al2);
		System.out.println();
		
		
		LinkedList<Object> ll = new LinkedList<>(al1);
		System.out.println(ll);
  }
}
