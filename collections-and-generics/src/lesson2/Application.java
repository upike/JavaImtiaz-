package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
	public static void main(String[]args){
		
		
		ArrayList<String> animals1 = new ArrayList<String>();
		 
		animals1.add("Lion");
		animals1.add("cat");
		animals1.add("dog");
		animals1.add("bird");
		
//		for(int i =0 ; i<animals.size() ; i++) {
//			System.out.println(animals.get(i));
//		}
//		System.out.println();
//		for (String temp: animals) {
//			System.out.println(temp);
//		}
		
		ArrayList<Vehicle> carsL =new ArrayList<Vehicle>();
		Vehicle car1= new Vehicle("Ford", "Mustang", 130000, true);
		Vehicle car2=new Vehicle("Skoda", "Octavia", 500, false);
		Vehicle car3= new Vehicle("BMW", "M3",10000, true);
		Vehicle car4 = new Vehicle ("Honda", "Acord", 6000, true);
		
		carsL.add(car1);
		carsL.add(car2);
		carsL.add(car3);
		carsL.add(car4);
		carsL.add(new Vehicle("Toyota", "Supra", 3000, false));
//		
//		for(Vehicle temp : cars) {  // the collection that it's going to be traversing over is called cars. 
//			System.out.println(temp);
//		}
		
		List<String> animals =new ArrayList<String>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("cat");
		animals.add("Bird");
		
		List<Vehicle> cars = new LinkedList<Vehicle>(); 
		cars.add(new Vehicle("Ford","Mustang",170000, true));
		cars.add(new Vehicle("Skoda", "Octavia", 1000, false));
		cars.add(new Vehicle("BMW", "M3", 200000, true));
		
		
		printsElements(animals);  // List is a supertype of ArrayList, LinkedList means it is their parent. 
		printsElements(cars);
		printsElements(animals1);
		printsElements(carsL);
		
		
		
		
		
		
	}
	
	public static void printsElements(List someList) {     //So this is sort of a generic method. It's not 100 percent generic yet.
		for(int i=0 ; i<someList.size(); i++) {
			System.out.println(someList.get(i));
		}
		System.out.println();
	}
	
	
}




// take a stab at  - sprobowaæ 
//All right welcome back hopefully you took a stab at that.

/*
 * The ArrayList this is good for getting data retrieving data from the list and
 * the LinkedList is good for manipulating the list structure you know adding
 * and removing things the LinkedList is far better for doing that. But that's
 * the general idea they're both implementing the List interface.
 */
