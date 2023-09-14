package Oops_Concept;

public class Single_Inheritance {

	public static void main(String[] args) {
		Son family=new Son();
		family.son();
		family.father();
		System.out.println(family.laptop);
	}
}
class Father{
	void father() {
		String f_bike="pulsar";
		String f_car=" maruti";
		String f_money=" 2 Lakhs";
		System.out.println(f_bike+f_car+f_money); 
	}
}
class Son extends Father{
	String laptop="Dell";

	void son() {
		String bike="pepo";
		String cycle="lady bird";
		System.out.println("Son"); 
	}
}
