package Oops_Concept;

public class Constructor {

	public static void main(String[] args){
		Father1 f=new Father1();

		
		}
}
	class Father1{
		
		Father1 (){
			this(500);
			System.out.println("Welcome to HDFC Bank");
			bank();
		}
		Father1(int a){
			System.out.println("Param Cons : " + a);
		}
		public void bank() {
			System.out.println("HDFC Bank");
		}
	}
	


