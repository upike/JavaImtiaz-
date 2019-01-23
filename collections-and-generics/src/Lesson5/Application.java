package Lesson5;

import java.util.HashMap;   //A map is basically like a dictionary
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//import com.sun.javafx.collections.MappingChange.Map;

public class Application {

	public static void main(String[] args) {
				//K    V > key, value
		HashMap<String, String> dictionary =new HashMap<String, String>();  //  Now the important thing to remember about a HashMap is every row of data is considered an entry which contains a key and a value. You've got words and then you've got their definitions.
		//So in these angle brackets we have to first identify the data type for the key and then we identify the data type for the value.
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage."); // we need to pas Key an Value // in lists we use .add() and for maps .put()!!! 
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happines.");
		dictionary.put("Confidence", "he state of feeling certain about the truth of something.");
		
		for(String word: dictionary.keySet()) {
			System.out.println(word);
			
		}
		System.out.println("there is no order to sort it we need to use LinkedHashMap");
		System.out.println();
		System.out.println("Now it's going to preserve the order in which these data was inserted"); //the LinkedHashMap preserves the order of insertion.  preserves - zachowaæ, utrzymaæ  
		System.out.println();
		
		LinkedHashMap<String, String> dictionaryLinked =new LinkedHashMap<String, String>();  //  Now the important thing to remember about a HashMap is every row of data is considered an entry which contains a key and a value. You've got words and then you've got their definitions.
		//So in these angle brackets we have to first identify the data type for the key and then we identify the data type for the value.
		dictionaryLinked.put("Brave", "ready to face and endure danger or pain; showing courage."); // we need to pas Key an Value // in lists we use .add() and for maps .put()!!! 
		dictionaryLinked.put("Brilliant", "exceptionally clever or talented.");
		dictionaryLinked.put("Joy", "a feeling of great pleasure and happines.");
		dictionaryLinked.put("Confidence", "he state of feeling certain about the truth of something.");
		
		for(String word: dictionaryLinked.keySet()) {
			System.out.println(word);
		}
		System.out.println();
		for(String word: dictionaryLinked.keySet()) {
			System.out.println(dictionaryLinked.get(word));
			
			// printing out key and value together
			System.out.println();
			
			for(Map.Entry<String, String> entry :dictionaryLinked.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				System.out.println();
			}
			
		}
		
		
		// TreeMap - sort in alphabetical order 
		TreeMap<String, String> dictionaryTree =new TreeMap<String, String>();  //  Now the important thing to remember about a HashMap is every row of data is considered an entry which contains a key and a value. You've got words and then you've got their definitions.
		//So in these angle brackets we have to first identify the data type for the key and then we identify the data type for the value.
		dictionaryTree.put("Brave", "ready to face and endure danger or pain; showing courage."); // we need to pas Key an Value // in lists we use .add() and for maps .put()!!! 
		dictionaryTree.put("Brilliant", "exceptionally clever or talented.");
		dictionaryTree.put("Joy", "a feeling of great pleasure and happines.");
		dictionaryTree.put("Confidence", "he state of feeling certain about the truth of something.");
		dictionaryTree.put("Brilliant", "XXXXXXXXXX");  ///OK so you can't have duplicate keys in the map data structure similar to you know the set structure. You can't have duplicates.
		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		for(String tempVal: dictionaryTree.values()) {
//			System.out.println(tempVal);
//		}
		
		System.out.println();
		System.out.println("TreeMap in alphabetical order Keys");
		
	
		for(Map.Entry<String, String> entry :dictionaryTree.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}
		
		
	}
}