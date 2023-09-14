package String;

public class BufferString {

	public static void main(String[] args) {
		StringBuffer word1=new StringBuffer(" Hello ");  
		StringBuffer word2=new StringBuffer( " Hi Java ");  
		
		//append
        System.out.println(word1.append(word2));
		
		//replace
		 
		System.out.println(word1.replace(2,4,"Java"));
		
		//reverse
		
		System.out.println(word2.reverse());
		
		//trim-remove white space in start and end
		word1.trimToSize();
        System.out.println(word1);
        
        
        //substring
        System.out.println(word1.substring(1,5));
        
     //equals--checks value of string
        System.out.println(word1.equals(word2));
        
      //== - checks memory location of string
        System.out.println(word1==(word2));
        
}

}
 