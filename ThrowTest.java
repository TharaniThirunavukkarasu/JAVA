package Oops_Concept;

public class ThrowTest extends  PasswordException {

	public static void main(String[] args) throws Exception {
	PasswordException pe=new PasswordException();
	try {
		pe.VerifyPassword("tharani");
	}
	catch(PasswordException e){
		System.out.println("too short password");
	}
	}

}

