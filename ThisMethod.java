package Oops_Concept;

public class ThisMethod {

	public static void main(String[] args) {
//		Calci a = new Calci();
//		a.addition(10,10,10);
//		a.display();
	}
}

class Calci {
	int a;
	int b;
	int c;

	void addition(int a, int b) {
		this.a=a;
		this.b=b;
	}

	void addition(int a, int b, int c) {
		this(a,b);
		this.c=c;
		
	}
	void display() {
		System.out.println("the is output is: "+(a+b+c));
	}

}
