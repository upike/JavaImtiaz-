import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ApplicationImtiaz {

	public static void main(String[] args) /*throws FileNotFoundException -instead of that we surround with try {} and catch our code with file processing*/ {

		/*
		 * for (int i = 0; i <= 3; i++) { Scanner input = new Scanner(System.in);
		 * System.out.println("Enter some text: "); String enteredText =
		 * input.nextLine(); System.out.println(enteredText); }
		 */
		try {
			File file = new File("myfile.txt");
			Scanner input;

			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close(); // this method closes this scanner
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
//			e.printStackTrace();
		}
	MyFileUtils myobject = new MyFileUtils();
	try {
		myobject.substract10FromLargerNumber(9);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}

// The word exception All it really means is an error if some error happens. That's all an exception means. and we can define our own methods that throw exceptions. 