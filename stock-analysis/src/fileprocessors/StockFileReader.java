package fileprocessors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StockFileReader {

	String filePath = null;

	public StockFileReader(String filePath) {
		this.filePath = filePath;
	}

	public List<String> getHeaders() throws IOException {
		String line = readFirstLine(filePath);
		String[] header = line.split(",");
		List<String> values = new ArrayList<String>();
		values = Arrays.asList(header);
		return values;
	}

	static String readFirstLine(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	/**
	 * Complete the body of this method.
	 * 
	 * @return List
	 * @throws IOException
	 */
	public List<String> readFileData() throws IOException {
		List<String> lines = new ArrayList<String>();
		// Insert your code here..

		
//		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//			br.readLine();
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				lines.add(line);
//				System.out.println(lines);
//			}
//
//		}
//		

		
		  try { File file = new File(filePath); Scanner input;
		  
		  input = new Scanner(file); 
		  input.nextLine(); 
		  while (input.hasNextLine()) {
		  
		  lines.add(input.nextLine());
		  
		  //System.out.println(lines);
		  
		 
		  
		 }
		  
		input.close(); // this method closes this scanner 
		 } catch
		  (FileNotFoundException e) {
		  System.out.println("file not found");  }
		 

		return lines;
	}

}
