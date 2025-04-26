import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DiffWaysOfCreatingCollectionObject {
  public static void main(String[] args) {
    //List type collection
    //using new keyword and constructor //java 1.2v
    ArrayList<Object> al = new ArrayList<>();     //mutable collection.
    al.add("a");
    al.add("b");
    al.add(5);
    al.add(6.7);
    al.add(true);
    System.out.println(al);

    //using Arrays.asList(-)  //java 1.2v
    List<Object>  list1 = Arrays.asList("a", "b", 5, 6.7, true); //immutable collection.
    System.out.println(list1);
    //list1.add('p');   // does not allow because of immutable collection

    //java 9v
    List<Object> list2 = List.of("a", "b", 5, 6.7, true);     //immutable collection
    System.out.println(list2);
    //list2.add('p');   // does not allow because of immutable collection

    //java 1.2v
    List<Object> list3 = Collections.unmodifiableList(al);        //immutable collection
    System.out.println(list3);
    //list3.add('p');   // does not allow because of immutable collection

    //Java 10v
    List<Object> list4 = List.copyOf(al);       //immutable collection
    System.out.println(list4);
    //list4.add('p');   // does not allow because of immutable collection

    //Set type collections
    //1.By using new keyword and constructor
    HashSet<Object> hs = new HashSet<>();
    hs.add("a");
		hs.add("b");
		hs.add(5);
		hs.add(6.7);
		hs.add(true);
		System.out.println(hs);

    //2. By using Set.of(-) from Java 9v
    Set<Object> set1 = Set.of("a","b", 5,6.7,true);       //  new immutable Set with new elements
    System.out.println(set1);
		//set1.add('p');      // does not allow because of immutable collection

    // 3. by using  collection.unmodifiableSet       // java 1.2v
		Set<Object> set2 = Collections.unmodifiableSet(hs);		// creates immutable set from existing set.
		System.out.println(set2);
		//set2.add('p');      // does not allow because of immutable collection

    // 4. by using Set.copyOf(-) from Java 10v
		// creates immutable set from existing set
		Set<Object> set3 = Set.copyOf(hs);
		System.out.println(set3);
		//set3.add('p');      // does not allow because of immutable collection

    //5. Creating mutable collection from other collection
    Set<Object> set4 = new HashSet<>(set3);
    System.out.println(set4);
    set4.add('p');
    System.out.println(set4);

    //6. creating mutable Set from other Set
    Set<Object> set5 = new HashSet<>();
    set5.addAll(set1);
    System.out.println(set5);
    set5.add('p');
    System.out.println(set5);
    System.out.println(set1);
    System.out.println();

    hs.add('p');
		System.out.println(hs);
		System.out.println(set2);   //Changed are reflected from original collection because it was created from unmodifiable.
		System.out.println(set3);
		System.out.println();
		System.out.println();

    //Map type collections  
    //1. By using new keyword and constructor
    Map<Object,Object> map1 = new HashMap<>();
    map1.put("a", 1);
    map1.put("b", 2);
    System.out.println(map1);
  
    //2. By using new keyword constructor
    //creating new mutable map with existing map
    Map<Object,Object> map2 = new HashMap<>(map1);
    System.out.println(map2);

    //3. By using Map.putAll
    //creating new mutable map with existing map
    Map<Object, Object>  map3 =  new HashMap<>();
    map3.putAll(map1);
    System.out.println(map3);

    //4. By using Collections.unmodifiableMap(-)
		// creating new immutable map with existing map
		Map<Object, Object>	map4 = Collections.unmodifiableMap(map1);
		System.out.println(map4);
		//map4.put("c", 3);       // does not allow because of immutable collection
    
    //5. By using Map.of(-) from Java 9v
		//creates immutable map with new entries with less code
		Map<Object,Object> map5 = Map.of("a", 1, "b", 2);
		System.out.println(map5);
		//map5.put("c", 3);       // does not allow because of immutable collection
    
    //6. By using Map.copyOf(-) from Java 10v
		//creates immutable map with existing entries with less code
		Map<Object,Object> map6 = Map.copyOf(map1);
		System.out.println(map6);
		//map6.put("c", 3);       // does not allow because of immutable collection
		
		System.out.println();
    //=========================================
    map1.put(5, "x");
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
		System.out.println(map4);
		System.out.println(map5);   //Changed are reflected from original collection because it was created from unmodifiable.
		System.out.println(map6);
  }
}
//Note:
//After you create collection from unmodifiable.... collections, if you change(add/remove) on original collection then those
//changes will reflected in the created unmodifiable... collection.