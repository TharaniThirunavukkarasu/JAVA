package Oops_Concept;

public class NestedClass {

	public static void main(String[] args) {
		Outer a = new Outer();
		a.abc();
		Outer.InnerClass Obj = new Outer().new InnerClass();
		Obj.xyz();
	}

}

class Outer{
	void abc() {
		System.out.println("print abc:");
	}

	class InnerClass {
		void xyz() {
			System.out.println("print xyz:");
		}
	}
}