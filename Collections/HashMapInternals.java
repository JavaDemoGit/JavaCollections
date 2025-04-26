import java.util.HashMap;

public class HashMapInternals {
  
  public static void main(String[] args) {
    HashMap<Object, Object> hm = new HashMap<>();

    System.out.println(hm.size());
    System.out.println(hm);
    System.out.println();


    hm.put("a", 15);
    hm.put("a", 16);
    hm.put(new String("a"), 17);

    hm.put(97, 4);
    hm.put(97, 5);
    hm.put(Integer.valueOf(97), 6);

    System.out.println(hm.size());
    System.out.println(hm);
    System.out.println();

  }
}

/*
 * When we are adding object to 
 * HashSet, LinkedHashSet,
 * HashMap, LinkedHashMap,
 * Hashtable , Properties 
 *   put method internally calls 
 *   1. hashCode()
 *   2. == operator
 *   3. equals() method
 *  for stopping duplicate objects
 *  
 *  To stop duplicate object, newly added key  must be compared to all keys available in this map.
 *  
 *  for comparison we need 
 *  	1. == operator			--> for ref comparison.
 *  	2. equals() method	--> for  data comparison.
 *  
 *  Then why do we need hashCode?
 *  hashCode() is not meant for comparison rather it is meant for storing relative objects as  one group and further it is used for finding the newly adding or 
 *  searching object belongs to which group.
 *  
 *  Due to hashCode() and due to grouping relative objects as one unit number of comparisons will be decreased and execution will be fast.
 *  
 *  procedure ::
 * when we add object to Map,
 * 1. put method internally calls hashCode() method by using this object/key.
 * 2. put method will find with this key hashCode() if there is any bucket already exist.
 * 3. if not existed, it creates new bucket and stores this object in this bucket directly without any comparisons.
 * 4. if bucket is available, then comparison starts to know whether this object/key is duplicate or not.
 * 		i) it uses  == operator to compare objects with ref, if ref is same , it is duplicate, existing mapped value is replaced with this new value.
 * 
 * 	 ii) If ref is different, it calls equals(-) method to compare two objects with  their data, if data is same ,it is duplicate , existing mapped value is replaced
 * 			 with new value. 
 * 	iii) If data is different , it stored in the same bucket.
 * 
 * 
 *  	
 *  */