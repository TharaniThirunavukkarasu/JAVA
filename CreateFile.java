package FileHandling;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		try {
			
		File obj=new File("filedemo.txt");
		System.out.println("File created");
		}
		catch(Exception e){
			System.out.println(e);
	}
		
		

}
}