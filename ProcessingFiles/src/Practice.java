import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice {
	
	public static void main(String [] args) {
		try {
		File file=new File("practicefile3.txt");
		Scanner scan;
	
			scan = new Scanner(file);
			
		
		while (scan.hasNextLine()){
		String linia=scan.nextLine();
		System.out.println(linia);
		}
		scan.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
