package Oops_Concept;

public class ConstructorOverloading {

	public static void main(String[] args) {
		Calculator a=new Calculator();
		

	}
	}
	//Method OL
	class ArithmeticCalculator{

		void addition(int a,int b) {
			System.out.println("Arithmetic Addition Output ; " + (a+b));
		}
		void sub(int a,int b) {
			System.out.println("Arithmetic Subraction Output ; " + (a-b));
		}
		public ArithmeticCalculator() {
			this(2,2.2);
			addition(5,2);
			sub(10,5);
			System.out.println("I am a def constructor from par class");
		}
		public ArithmeticCalculator(int a, double b) {
			System.out.println("I am a param constructor from par class " + (a+b));
		}
	}

	class Calculator extends ArithmeticCalculator{
		
		void addition(int a,int b) {
			System.out.println("Arithmetic Addition Output ; " + (a+b));
		}
		void div(int a,int b) {
			System.out.println("Arithmetic Division Output ; " + (a/b));
		}
		public Calculator() {
			this(3,3.5);
			addition(2,3);
			div(6,2);
			System.out.println("I am a def constructor from child class");
		}
		public Calculator(int a, double b) {
			System.out.println("I am a param constructor from child class " + (a*b));
		}
	}


