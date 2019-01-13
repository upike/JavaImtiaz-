// 22. Lecture 19: Nested For Loops and Debugger
package practice.loops;

public class LoopsPracticeDebuger {

	public static void main(String[] args) { // green highlighted line means that this line has not executed yet.

		int counter = 0; // double click on left grey bar next to numbers then right click and Debug As
							// -> 1 Java Application

		for (int i = 0; i <= 100; i = i + 1) {
			System.out.println(i);

			int temp = counter + 1; // temp is within the scope of that particular loop iteration

			counter = temp;
			System.out.println("counter");
		
		}

	}
	
}
