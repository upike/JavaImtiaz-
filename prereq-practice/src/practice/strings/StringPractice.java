package practice.strings;

public class StringPractice {

	public static void main(String[] args) {
		String a= "Hello";
		String b= "there";
		System.out.println(a.length());
		
		String str = "ABCDEFG";
		String extractedString= str.substring(2,5);
		System.out.println(extractedString);
		
		
		if(a=="Hello") {
			// THIS IS A TRAP. DON'T DO THIS
		}
		if(a.equals("hello")) {
			// USE THIS!!!
			
			System.out.println("a is equal Hello");
		}
		else System.out.println("a is different that Hello");
		
		
		if(b.equals("There")) {
			System.out.println(b +" equals There");
		}
		if(b.equalsIgnoreCase("therE")) {
			System.out.println("equalsIgnoreCase was used");
		}
		
		a.charAt(4);
		char extractedb= b.charAt(b.length()-1);
		System.out.println(extractedb);
		
		// The next handy method we're looking at for manipulating strings is called the index of method indexOf(string s); 
		String longstr="Hi there I am Johny";
		int index=longstr.indexOf("there");  // so we passed this method a string argument and it basically searches for that string 
		//and the way it does this is it searches from left to right and it returns the index number where that target string first occurs. between 
		System.out.println(index);
		
		String test= "Hello there yogi there one more yogi to show difference between indexOf() and lastIndexOf() ";
		int firstindex=test.indexOf("yogi");
		int lastindex=test.lastIndexOf("yogi");
		System.out.println("indexOf(\"yogi\") returns firstindex= " +firstindex); // it searches from left to right. 
		System.out.println("lastIndexOf(\"yogi\") returns  lastindex= "+lastindex); // it searches form right to left.
		System.out.println(test.charAt(lastindex));
		System.out.println(test.charAt(firstindex));
		
	
	
	}

}