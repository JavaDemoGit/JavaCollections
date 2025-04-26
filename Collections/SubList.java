import java.util.ArrayList;
import java.util.List;

public class SubList {
  public static void main(String[] args) {
    List<Object>	list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(5);
		list.add(6.7);

    List<Object> list2 = list.subList(1, 3);    //End index is not included
    List<Object> list3 = list.subList(1, 4);
    System.out.println(list);
    System.out.println(list2);
    System.out.println(list3);

    //ArrayList<Object> al1 = (ArrayList)list.subList(1, 4); 
    List<Object> list4 = list.subList(1, 4);
		System.out.println(list.subList(2, 4));
    System.out.println(list.subList(0, 4));
    //System.out.println(list.subList(-1, 4));   // start and end index >= positive and <= size
    System.out.println(list.subList(0,5));
    //System.out.println(list.subList(3,1));   //start index <= end index
    System.out.println(list.subList(3, 3));
  }
}
