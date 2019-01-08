package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		int values =100;  // this variable is pointing to a single data point which is 100
		int [] arrayName= new int [100]; // at this line we were doing two things. We are declaring a variable of type integer array. 
				// we are initializing an array. we're initializing an array with 100 slots. 
				// It's very important to keep in ming that this is a fixed size. Once this line is executed this variable will be capable 
				// of referencing multiple elements 100 of them . 100 slots
				
	    arrayName[0]=1000;
		arrayName[99]=93432; 
		
		System.out.println(arrayName[1]); // So this should show you that all slots that have not been assigned to any data yet are by default initialized 
		// with 0 ; 
		
		System.out.println(arrayName[0]); 
		//System.out.println(arrayName[100]); It will give as some error Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
		
		// String [] words = new String[] {"My", "Name", "is"};
		String [] words = new String[3];
		words[0]="My";
		words[1]="name";
		words[2]="is";
		System.out.println(words[0]+" "+words[1]+ " " +words[2]);
		
		words= new String [10]; // after this line we are assigning 10 brand new slots to this variable. The old data is gone at this point from this variable 
		System.out.println(words[0]); // null 
	}

}

