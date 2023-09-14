package Oops_Concept;

public class MethodClass {

	public static void main(String[] args) {
		OuterClass a=new OuterClass();
		a.abc();

	}

}

class OuterClass{
	void abc() {
		System.out.println("print abc:");
		class InnerClass {
			void xyz() {
				System.out.println("print xyz:");
			}
		}
		InnerClass b=new InnerClass();
		b.xyz();

	}
}