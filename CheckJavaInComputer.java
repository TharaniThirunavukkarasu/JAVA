package moodleAssessment;

public class CheckJavaInComputer {

	public static void main(String[] args) {
		 System.out.println("Java Version: "+System.getProperty("java.version"));
		 System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		 System.out.println("\nJava Home: "+System.getProperty("java.home"));
		 System.out.println("\nJava Vendor: "+System.getProperty("java.vendor"));
		 System.out.println("\nJava Vendor url: "+System.getProperty("java.vendor.url"));
		 System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
	}

}
