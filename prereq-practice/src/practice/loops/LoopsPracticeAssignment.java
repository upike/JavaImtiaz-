package practice.loops;

public class LoopsPracticeAssignment {

	public static void main(String[] arg) {
		// We have a large inventory of things in our warehouse falling in"
		// +"the category:apperal and the slightly
		// + "more in demand category:makeup along with the category:furrniture and.."
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apperal and the slightly "
				+ "more in demand category:makeup along with the category:furniture and...";

		printCategories(str);

		/**
		 * extract all categories from the string argument Print out: apperal makeup
		 * furniture
		 * 
		 */

	}
	
	
	public static void printCategories(String string) {
		
		int i=0;
		while(true) {
			int found=string.indexOf("category:",i);
			if(found==-1)break;
			int start =found+9; // start of the actual category
			int end = string.indexOf(" ",start);
			System.out.println(string.substring(start,end));
			i=end+1; // i=end works ass well. 
		}
	}
	
	
	
	
	
	
	
	
///BENEATH MY SOLUTION
//	public static void printCategories(String str) {
//		
//		//int strCounted = str.length();
//		//System.out.println("Word category has " + strCounted + " character's");
//		int end = 0;
//		int firstOccurrence=0;
//		//int temp=0;
//		System.out.println("makeup firstOccurrence= "+str.indexOf("category:makeup"));
//		System.out.println("furniture firstOccurrence= "+str.indexOf("category:furniture"));
//		// IMPORTANT if indexOf() does not find searching word it returns -1 !!!!
//		while (end < str.length()) {
//			firstOccurrence = str.indexOf("category", end);
//			if(firstOccurrence<0)break;
//			end = str.indexOf(" ", firstOccurrence);
//			String printedItOut = str.substring(firstOccurrence + 9, end);
//			
//			System.out.println(printedItOut);
//			
//
//		}
//
//		// System.out.println(firstOccurrence);
//
//		// System.out.println(str.charAt(firstOccurrence));
//
//		// System.out.println(str.substring(0, 10));
//
//	}
}
