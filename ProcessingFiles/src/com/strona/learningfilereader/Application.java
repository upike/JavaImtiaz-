package com.strona.learningfilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import java.io.*;

public class Application {

	public static void main(String[] args) {

		File file = new File("myfile.txt");
		try {
			FileReader fileReader = new FileReader(file);   // For example this file reader is able to read everything
															// and characters and there is no real easy way
															// of reading the data using the file reader directly
			BufferedReader bufferedReader = new BufferedReader(fileReader); //We need to use this thing called Buffored reader.And this class has the ability to take a file reader object and go line by line reading the data and
																			//it's actually more efficient.
																			//It doesn't read the entire file in one go it reads it line by line.
			String line= bufferedReader.readLine();  // we need to handle an exception // -> Add catch clause to surrounding try 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {                    // this line> String line= bufferedReader.readLine(); throws IOExceptin so if is the exception cause by this line it goes to IOExcetion catch.   
			// TODO Auto-generated catch block       //And basically what this means is if there is a problem with your disk accessing reading or writing data
													//from the disk or your computer that's one this(IOException) exception will be triggered.
			//e.printStackTrace();
			System.out.println("Problem reading the file" +file.getName());
		}

	}

}
