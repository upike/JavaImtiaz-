package java_basics;

public class MyUtils {
	public static void printSomeJunk(String argument) {
		System.out.println("Some blba bala bla " + argument);
		System.out.println(argument);
	}	
	
	public static /*void*/ int printSomeJunk(int argument) {             
		System.out.println(argument);
		return argument; 
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg+secondArg);
		
	}
	public static int add10(int someArgument) { // when you go to the definition of the method These are typically referred to as parameters its naming convention. When we invoke methods it is called arguments. 
		int result= someArgument+10;
		return result; // Very important to keep in mind void methods cannot return a value!
		// void method are doing things but they're not actually returning anything. 
		
	}

	/* static */ public int add100(int x) {            // Press Ctrl + Shift + /     dodawanie komentarza 
		
		return x+100; 
	}
}
