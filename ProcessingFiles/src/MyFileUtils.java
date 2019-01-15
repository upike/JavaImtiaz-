import com.strona.exceptions.FooRuntimeException;

public class MyFileUtils {
	
	public int substract10FromLargerNumber(int number) throws FooRuntimeException { //We're going to give it the variable or parameter number and it's going to return the value of subtracting the number 10 from the number that was passed in.
		if(number <10) {
			throw new FooRuntimeException("The number passed was smaller than 10");  // An Exception is the class and in this line we throw a new instance of that class. 
		}
		return number-10;
			
		}
	// we can define our own exceptions 
/*	public class FooRuntimeException extends Exception{

		public FooRuntimeException(String message) {
			super(message);
		}		
	}*/
}

/*
 * So whatever code calls this method - that code will be aware - OK you know what
 * this method may throw an exception if the user enters a number that is less than the number 10.
 * This method may throw an exception and what exception will throw.
 */