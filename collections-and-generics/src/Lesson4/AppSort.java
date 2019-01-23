package Lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class AppSort {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(12);
		list1.add(2);
		list1.add(88);
		list1.add(44);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		
		list1.sort(null);

		System.out.println(list1);
		
		
		
		
		HashSet<Integer> hashSetVal =new HashSet<Integer>();
		hashSetVal.add(500);
		hashSetVal.add(1);
		hashSetVal.add(46);
		hashSetVal.add(13);
		hashSetVal.add(577);
		hashSetVal.add(98);
		hashSetVal.add(9);
		
		ArrayList<Integer> hashToList = new ArrayList<Integer>(hashSetVal); 
		
		Collections.sort(hashToList); // public static <T extends Comparable<? super T>> void sort(List<T> list) it accepts List so first we need to convert HashSet to list
		System.out.println(hashToList);
		System.out.println();
		// How to compare strings 
		HashSet<String> hashOfStrings = new HashSet<String>();
		
		hashOfStrings.add("Random");
		hashOfStrings.add("Toth Brush");
		hashOfStrings.add("Computer");
		hashOfStrings.add("Clothes");
		
		ArrayList<String> listOfStrings =new ArrayList<String>(hashOfStrings);
		System.out.println();
		System.out.println("Before sort " + listOfStrings);
		Collections.sort(listOfStrings);
		System.out.println(listOfStrings);
		
		
		HashSet<Employee> hashOfEmployee = new HashSet<Employee>();
		
		hashOfEmployee.add(new Employee("Mike",3500, "Accounting"));
		hashOfEmployee.add(new Employee("Paul",2000, "Maint"));
		hashOfEmployee.add(new Employee("Peter",3000, "Admin"));
		hashOfEmployee.add(new Employee("Adam",4000, "sales"));
		hashOfEmployee.add(new Employee("John",7000, "It"));
		
		ArrayList<Employee> listOfEmployees =new ArrayList<Employee>(hashOfEmployee);
		
		Collections.sort(listOfEmployees);
		System.out.println(listOfEmployees);
		
	}

}
