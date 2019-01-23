package Lesson4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(2);
		list1.add(88);
		list1.add(44);
		list1.add(67);
		list1.add(43);
		
		
		ArrayList<Integer> list2 =new ArrayList<Integer>();
		
		list2.add(10);
		list2.add(88);
		
		list1.addAll(list2);
		
		System.out.println();
		System.out.println(list1);
		System.out.println();
		
		for(Integer temp: list1) {
			System.out.println(temp);
		
		}
		
		boolean isContain =list1.contains(44);
		System.out.println("Here we check if list1 contains value 44: odpowiedz:" + isContain);
		
		boolean isEmpty = list1.isEmpty();
		System.out.println("Here we check if list1 is empty and the ansver is: " + isEmpty);
		
		System.out.println("after list1.clear");
		list1.clear();
		System.out.println(list1);
		isEmpty = list1.isEmpty();
		System.out.println("Here we check one more time if list1 is now empty and the ansver is: " + isEmpty);
		
		System.out.println();
		// retainAll is used to remove everything except for the values that you'd like to retain. 
		list1.add(2);
		list1.add(88);
		list1.add(44);
		list1.add(67);
		list1.add(43);
		
		list2.add(88);
		list1.retainAll(list2);
		System.out.println(list1);
		// converting HashSet to ArrayList;
		
		
		HashSet<Float> toBeConverted = new HashSet<Float>();
		
		toBeConverted.add(10.1F);
		toBeConverted.add(13.0F);
		toBeConverted.add(9.0f);
		toBeConverted.add(67.9f);
		toBeConverted.add(10.1f);
		
		System.out.println(toBeConverted);
	
		
		List<Float> li =new ArrayList<Float>(toBeConverted);    // There are benefits from converting you know lists into linked lists Or you know hash sets into lists and so on back and forth you can do that.
		//You just instantiate a new list or new collection or whether it's a hash set or list and then you specify in the arguments of the constructor the data that you would like this new object to be populated with.
		
		System.out.println(li);
		
		
		
		
		
		
		
		
		
	}

}
