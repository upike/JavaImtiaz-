package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		// int [] myArr=new myArr[10];  // tablice maj¹ ustalony rozmiar i nie mo¿na go zmienic You can certainly change the things that go into each one of those slots but you can't change the number of slots
		// It's a fixed size data structure. // Once an array is created the number of slots cannot be changed. 
		// ArrayList- is nothing but a resizable array. The underlying implementation is based on the array structure.
//		ArrayList  words =new ArrayList();
//		words.add("Hello");
//		words.add("there");
//		//words.remove(0); 
//		words.add(10);
//		words.add(9);
//		words.add(12.00);
//		words.add('H');
		
	//	String item1= (String) words.get(0);// we need to cast to string because it returns an object
//		Object itemObject= words.get(1); // Object is the  parent for every single data type in Java is the granddady of all objects. (double's , floats , Strings.. everything is an object in Java. 
		
//		Object item1 = words.get(2);
//		Object item2= words.get(3);
//		Integer item1 = (int) words.get(2);
//		int item2= (int)words.get(3);
//		System.out.println(item1+ item2); // we need cast to int because we cannot add two objects. 
		
		 /*  Java is a type safe language- meaning that it forces the developer to know
		 * on every single line what data type a particular value is.
		 * That information should not be you know hidden somewhere or should be immediately available.
		 * And this ensures that there are no data type issues during runtime. The errors could be caught while compiling during compile time right now and recoding.
		 */		
		ArrayList<String>words = new ArrayList<String>(); //Java 5 onwards introduced this templating the ability to template your types. 
														  //It's called parameterization which is just a fancy term to enforce only specific data types going into collections.
		words.add("someString");
		words.add("Hello!");
		words.add("Ford");
		String item1=words.get(0);
		String item2=words.get(1);
		String item3=words.get(2);
		System.out.println(item1);
		
		///////////////////////////////////////////////////
	//	LinkedList
		////////////////////////////////////////////////////
		
	//	LinkedList<int> numbers =new LinkedList<int>();  ERROR Syntax error, insert "Dimensions" to complete ReferenceType - All it means is we cannot put primitive data types into these angle brackets.
		/*
		 * The only difference is the underlying data structure that's been implemented for the linked list the array list is basically using an array in the implementation 
		 * whereas the linked list is using node objects.
		 * Basically the array list is a resizable array and a linked list is a bunch of nodes that are linked TOGETHER. Their underline implementation is different. 
		 */
		
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(23);
		numbers.add(13);
		numbers.add(100);
		
	///////////TEST DODAWANIA INTEGER///////////////	
		Integer a = 2;
		Integer b=5;
		int c= 10;
		System.out.println(a+b);
		System.out.println(a+c);
	////////////////////////
		
		for(Integer temp : numbers) {
			System.out.println(temp);
		}
		
		// The linkedList is like a train you have the different box carts connected together with links and that's exactly how I wand you to envision this LinkedList data structure 
		// When you need to add more data all it does is attaches a new cart at the end of the train and continues to do that.
		// LinkedList is actually better for manipulating the data compared to the arrayList. 
		// When we wand to remove something from the beginning of the ArrayList all of the items must be copied back to the zeroth index position. 
		
		/* But basically the linked list is faster for manipulating and anti-realist is faster for retrieving data to retrieve values from a linked list.
		 * It would have to be traversed completely to find the particular element whereas an array list much faster retrieval you just give the index position and there is no traversal.
		 * It just immediately goes to the particular slot and gives us that data.
		 */
		//retrieval - wyszukiwanie-odzyskiwanie, traversing-przechodzenie, przemierzanie. 
		numbers.remove(3);
		numbers.remove(); // first element will be removed 
		int remVar=numbers.removeFirst();
		
	}

}


//Lo and behold- patrzcie!




/*
 * The errors could be caught while compiling during compile time right now and
 * recoding.
 * 
 * These are compile time errors that we see these red squiggly lines that
 * appear.
 * 
 * This is a compile time issue.
 * 
 * We haven't run the application yet.
 * 
 * The Java compiler is complaining that hey this code doesn't make sense to me.
 */