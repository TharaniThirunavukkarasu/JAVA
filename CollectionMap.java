package Collections;

import java.util.*;

public class CollectionMap {

	public static void main(String[] args) {
		System.out.println("Hash  map");
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Sowmiya");
		map.put(3,"hari");
		map.put(6,null);
		map.put(2,"Tharani");
		map.put(4,"Tharani");
		map.put(1,"Arvind");
		map.put(5,null);
		map.put(null,"12");
	    map.put(null,"raj");
	    map.put(null,"Hari");
		
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}

System.out.println("  ");
System.out.println("Linked Hash map");
		HashMap<Integer,String> map1=new LinkedHashMap<Integer,String>();
		map1.put(1,"Sowmiya");
		map1.put(3,"hari");
		map1.put(6,null);
		map1.put(2,"Tharani");
		map1.put(4,"Tharani");
		map1.put(1,"Arvind");
		map1.put(5,null);
		map1.put(null,"12");
	    map1.put(null,"raj");
	    map1.put(null,"Hari");
		
		
		for(Map.Entry m1 : map1.entrySet()) {
			System.out.println(m1.getKey()+"  "+m1.getValue());
		}
		
		
		System.out.println("  ");
		System.out.println("Tree map");
		TreeMap<Integer,String> map2=new TreeMap<Integer,String>();
		map2.put(11,"Arun");
		map2.put(3,"hari");
		map2.put(6,null);
		map2.put(2,"Tharani");
		map2.put(4,"Tharani");
		map2.put(1,"Arvind");
		map2.put(5,null);
		map2.put(6,null);
		map2.put(7,null);
        map2.put(8,"12");
	    map2.put(9,"raj");
	    map2.put(10,"Hari");
	    
	    
	    for(Map.Entry m2 : map2.entrySet()) {
			System.out.println(m2.getKey()+"  "+m2.getValue());
		}
		
	}

}
