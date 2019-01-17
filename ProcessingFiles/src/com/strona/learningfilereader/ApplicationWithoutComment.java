package com.strona.learningfilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import java.io.*;

public class ApplicationWithoutComment {

	public static void main(String[] args) {

		File file = new File("myfile.txt");

		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Problem reading the file" + file.getName());
		} catch (NullPointerException ex) {
			System.out.println("file was probably never opened" + ex);
		}
		

	}

}

//So the new syntax that was introduced in Java 7 try with resources makes the Java code less verbose.
// verbose -rozwlek³y
// Onwards -dalej naprzód