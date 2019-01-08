package java_basics;
import someotherpackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) { // It starts from this main method goes line by line executing each line of code.
		System.out.println("fdafa");    // Ctrl + click on System -> this will take you to this class // and that's why this print line method has some stuff before it because it's not defined in this class it's defined someplace else and we're doing a similar thing with MyUtils.printSomeJunk("jakis string");"
		// println() - you can think of this as being defined someplace else. I'm grossly simplifying Where this method is. But just understand that it's not in this class.
		// I just wanted you to be able to see that you can invoke methods on other objects other classes. 
		
		MyUtils.printSomeJunk("jakis string");
		MyUtils.printSomeJunk(13); // so this (with integer) method is being invoked. 
		MyUtils.sum2Numbers(5, 33);  // accessing method in a static way 
		int myvar=MyUtils.add10(22)+100;
		System.out.println(myvar);
		ExampleClass.doSomething();
		MyUtils myUtilsInstance;
		myUtilsInstance= new MyUtils(); 
		MyUtils object = new MyUtils();  // creating an instance of a class MyUtils in order to use non-static method add100(); 
		object.add100(200);  // accessing method in non-static way
		myUtilsInstance.add100(3);
		
		myUtilsInstance.printSomeJunk("string"); // wywolanie statycznej metody na objekcie klasy
		MyUtils.add100(1);                       // wywo³anie niestatycznej kalsy w sposób statyczny
	}

	// applicable - odpowiedni the reason for that is of course the argument that is accepts is supposed to be of type string and we are passing in an integer 
//public static void printSomeJunk(String argument) {
//	System.out.println("Some blba bala bla " + argument);
//	System.out.println(argument);
//	}	
	
//public static void printSomeJunk(int argument) {              // and just so that we can confirm that this in fact is the one that's being called I'm going to change 
//	System.out.println("Integer passed in: " + argument);     // or something to say integer that integer past passed in. 
//	System.out.println(argument);
//	}	
	// Well a system is a class so we can create our own classes.And since print some junk is defined within the same class I don't need to give any prefixes
	// but let's actually go over a quick example of what it would look like if I defined these methods in  another class. 
	// I'm going to right click here and go to new class and I would call it my utilities (MyUtils). 
	
}


// so we might be wondering with this print line method we have this other stuff right

// Ctrl + Shift + o - clean up unused imports
// methods with static keyword belong to class where they are defined without static keyword methods belong to the instance of this class - metode statyczna mozemy wywo³aæ 
// bez tworzenia obiektu. Metode nie statyczn¹ tylko na obiekcie klasy w ktorej jest zdeklarowana. 