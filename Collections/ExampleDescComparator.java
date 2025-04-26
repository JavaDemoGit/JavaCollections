import java.util.Comparator;

public class ExampleDescComparator implements Comparator<Example>{

  @Override
  public int compare(Example o1, Example o2) {
    return o2.getX()-o1.getX();
  }
  
}
