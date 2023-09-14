package Collections;
import java.util.*;

public class CollectionList {

	public static void main(String[] args) {
		
		//Arraylist
		
		ArrayList list=new ArrayList();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		list.add(null);  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		System.out.println(" ");
		//Linkedlist
		
		LinkedList list1=new LinkedList();//Creating arraylist  
		list1.add("Ravi");//Adding object in arraylist  
		list1.add("Vijay");  
		list1.add("Ravi");  
		list1.add("Ajay");  
		list1.add(null);  
		//Traversing list through Iterator  
		Iterator itr1=list.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		 
	}

}
