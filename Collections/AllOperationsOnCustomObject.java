import java.util.ArrayList;

public class AllOperationsOnCustomObject {
  public static void main(String[] args) {
    ArrayList<Object> al = new ArrayList<>();

    //storing
    al.add("a");
    al.add(5);
    al.add(new Example(5, 6));

    // counting and printing
		System.out.println(al.size());
		System.out.println(al);
		System.out.println();
		
		// retrieving 
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println();
		
		//searching
    System.out.println(al.contains(new String("a")));
    System.out.println(al.contains(Integer.valueOf(5)));
		System.out.println(al.contains(new Example(5,6)));
		System.out.println();

    //retrieving index
		System.out.println(al.indexOf(new String("a")));
		System.out.println(al.indexOf(Integer.valueOf(5)));
		System.out.println(al.indexOf(new Example(5,6)));
		System.out.println();
		System.out.println(al.lastIndexOf(new String("a")));
		System.out.println(al.lastIndexOf(Integer.valueOf(5)));
		System.out.println(al.lastIndexOf(new Example(5,6)));
		System.out.println();

    // removing element
		System.out.println(al.remove(new String("a")));
		System.out.println(al.remove(Integer.valueOf(5)));
		System.out.println(al.remove(new Example(5,6)));
		System.out.println(al);
  }
}
