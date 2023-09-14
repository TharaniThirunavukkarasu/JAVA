package Collections;

import java.util.*;


public class CollectionsSet {

	public static void main(String[] args) {
		//Hash set
		System.out.println("Hash set:");
		Set s1=new HashSet();
		s1.add("Tharani");
		s1.add("25");
		s1.add("true");
		s1.add("Tharani");
		s1.add("Java developer");
		s1.add("Tharani");
		s1.add("Thiru");
		s1.add(null);
	Iterator itr=s1.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("  ");
	
	
	
	// Linked Hash set
	System.out.println("Linked Hash set:");
	Set s2=new LinkedHashSet();
	s2.add("Balu");
	s2.add("25");
	s2.add("true");
	s2.add("arvind");
	s2.add("Java developer");
	s2.add("Tharani");
	s2.add("Thiru");
	s2.add("Tharani");
	s2.add(null);
	s2.add("Tharani");	
  Iterator itr1=s2.iterator();
   while(itr1.hasNext()){
	System.out.println(itr1.next());
}
	System.out.println("  "); 
   
   
   
// Tree set
	System.out.println("Tree set:");
	Set s3=new TreeSet();
	s3.add("Balu");
	s3.add("25");
	s3.add("true");
	s3.add("Arvind");
	s3.add("Java developer");
	s3.add("Tharani");
	s3.add("Thiru");
	s3.add("Tharani");
  Iterator itr3=s3.iterator();
   while(itr3.hasNext()){
	System.out.println(itr3.next());
}

	}
}
