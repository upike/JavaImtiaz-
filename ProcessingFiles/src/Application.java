import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
	System.out.println();   	//   public final static PrintStream out = null;  PrintStream is the data type of out variable belongs in System class.
	//System.in					//   public final static InputStream in = null;   in is a variable of type InputStream . InputStream is a separate class like PrintStream
								//  You just need to understand that this "in" variable can be used to take in data from the user into the application.
	
	Scanner input = new Scanner(System.in);    // Scanner is a class// public final class Scanner implements Iterator<String>, Closeable {
		/*
		 * public Scanner(InputStream source)     // Scanner constructor accepts an InputStream data type
		 * { this(new InputStreamReader(source),
		 * WHITESPACE_PATTERN); }
		 */
		/*
		 * Notice that it accepts an input stream so we can give it anything that is an
		 * input stream and we will
		 * 
		 * be able to instantiate an instance of scanner.
		 */
// input This variable will now have the ability to be able to read data from the keyboard 
	System.out.println("Enter some Text ");
	String enteredText = input.nextLine(); /*
												 * So down here on the second line I could do input dot next line and
											 * then assign this to a variable of
												 * type string and I'll say entered text.
												 * So whatever information the user enters that's going to be captured
												 * by this next line and assigned to
												 * this variable called entered text.
												 */
	System.out.println(enteredText);
	// READ INFORMATION FROM PLIK
	File file = new File("myfile.txt");  // So I'm going to create a variable of type file and then pass in the constructor the string name of this file that we want to read from.
	// File cannot be resolved to a type. to fix this  click an chose Import-> 'File'(java.io) -> import java.io.File;
	// File.class- So this class allows the ability to be able to read and write data files.
	Scanner input2=new Scanner(file); // this is another constructor of Scanner // this constructor accepts File type 
	// Unhandled exception type FileNotFounExcepton-> to fix it click on error and -> Add throws declaration 
		/* Scanner constructor declaration in Scanner.class
		 * public Scanner(File source) throws FileNotFoundException {
		 * this((ReadableByteChannel)(new FileInputStream(source).getChannel())); }
		 */
	while(input2.hasNextLine()) { // hasNextLine it returns true if there is another line in file 
	String line= input2.nextLine();
	System.out.println(line);
	}
	}

}
