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
		
		a.ch
	
	
	}

}
