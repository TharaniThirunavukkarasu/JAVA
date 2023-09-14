package moodleAssessment;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=10;
		int b=2;
		
		System.out.println(((a>b) && (b>a)) );
		System.out.println(((a>b) || (b>a)) );
		System.out.println(!((a>b) && (b>a)) );
	}

}
