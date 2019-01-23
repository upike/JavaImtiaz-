package Lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		
//		HashSet<Integer> values = new HashSet<Integer>(); // the set is used to prevent duplicates.
//		values.add(13);
//		values.add(9);
//		values.add(13);
//		values.add(199);
//		values.add(9);
//		
//		for(Integer temp: values) {
//			System.out.println(temp);
//		}
		HashSet<String> values = new HashSet<String>();
		values.add("Random");
		values.add("somestring");
		values.add("second String");
		values.add("onemorestring");
		values.add("Random");
		values.add("Random");
		/*
		 * for(int i=0; i<values.size(); i++) { System.out.println(); }
		 */
	for(String temp: values) {
		System.out.println(temp);
	}
	
	System.out.println();
	
	// LinkedHashSet does maintain order but also without repetitions (duplicates are still not allowed)
	LinkedHashSet<String> orderVal = new LinkedHashSet<String>();
	orderVal.add("Random");
	orderVal.add("2somestring");
	orderVal.add("3second String");
	orderVal.add("4onemorestring");
	orderVal.add("Random");
	orderVal.add("Random");
	
	for(String temp : orderVal) {
		System.out.println(temp);
	}
	
	System.out.println();
	HashSet<Animal> animals =new HashSet<Animal>();
	
	Animal animal1= new Animal("Dog",12);
	Animal animal2=new Animal("Cat",8);
	Animal animal3=new Animal("Bird",5);
	Animal animal4= new Animal("Dog",12);
	Animal animal5=new Animal("Kangaroo",24);
	
	
	
	animals.add(animal1);
	animals.add(animal2);
	animals.add(animal3);
	animals.add(animal4);
	animals.add(animal5);
		
	animals.add(new Animal("Lion" ,4));

	for(Animal temp: animals) {
		System.out.println(temp);
	}
	
	System.out.println();
	System.out.println(animal1.equals(animal4));
	
	System.out.println("hashCode animal1 " + animal1.hashCode());  // HashSet uses a hashCode to method to ensure uniqueness and if we do not overrride hashCode in Animal class the object with the same data would be displayed in hashSet
	System.out.println("hashCode animal4: " +animal4.hashCode());  
	
	
	
	
	
	
	
	}

} // https://www.w3resource.com/java-exercises/

/*
 * a set is basically very similar to a list except that it prevents duplicates
 * when you have an ArrayList or a LinkedList. You can put as many repeated data
 * in there without worrying about you know it's meant to store duplicates if
 * needed but a set data structure prevents duplicates from being inserted into
 * it.
 * The most important is a HashSet
 */

// ArrayList manages or maintains the order 
// HashSet does't care about the order. 