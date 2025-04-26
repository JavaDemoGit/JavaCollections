import java.util.TreeSet;

public class SortingTestCases {
  public static void main(String[] args) {
    TreeSet<Example> ts1 = new TreeSet<>(); // TS sorting algorithm	
    ts1.add(new Example(5, 6));         //o1.compareTo(o1)  --> ignored
    ts1.add(new Example(4, 5));         //o2.compareTo(o1)	 --> -ve num  -->Smaller --> o2 stored left side of o1. 
    ts1.add(new Example(6, 3));         //o3.compareTo(o1) --> +ve num --> Bigger-->o3.compareTo(o2)-> +ve num-->smaller-->o3 stored right side of o2
    ts1.add(new Example(6, 3));

    System.out.println(ts1);
    System.out.println();

    //Custom comparator for sorting object in descending order
    TreeSet<Example> ts2 = new TreeSet<>(new ExampleDescComparator());
    ts2.add(new Example(5, 6));
    ts2.add(new Example(4, 5));
    ts2.add(new Example(6, 3));
    ts2.add(new Example(6, 3));
    System.out.println(ts2);
    System.out.println();

    //Custom comparator for sorting objects in ascending order on y values
    TreeSet<Example> ts3 = new TreeSet<>(new ExampleAscComparator() {
      @Override
      public int compare(Example e1, Example e2) {
        return e1.getY()-e2.getY();
      }
      });

    ts3.add(new Example(5,6));
    ts3.add(new Example(4, 5));
    ts3.add(new Example(6, 3));
    ts3.add(new Example(6, 3));
    System.out.println(ts3);
    System.out.println();

    //custom comparator for storing objects in descending order on y values
    TreeSet<Example> ts4 = new TreeSet<>((e1, e2)->e2.getY()-e1.getY());
    ts4.add(new Example(5,6));
    ts4.add(new Example(4,5));
    ts4.add(new Example(6,3));
    ts4.add(new Example(6,3));
    System.out.println(ts4);
    System.out.println();
  }
}
