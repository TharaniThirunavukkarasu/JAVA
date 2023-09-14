package Oops_Concept;

public class PasswordException extends Exception {
	public void VerifyPassword(String pwd) throws Exception {
		if(pwd.length()<8) {
			PasswordException pe=new PasswordException();
			throw pe;
			
		}
		System.out.println("strong password");
	}

}
