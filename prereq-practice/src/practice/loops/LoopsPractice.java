package practice.loops;

public class LoopsPractice {
	public static void main(String [] cos) {
		System.out.println("test hello without parameters in main() method"); // main () nie moze byæ puste inaczej nie mamy uruchom jako aplicacja Javy
		int i=0;
		while ( !(i <=10) ) {
			System.out.println(i+" always true");
			i++; 
		}
		
		
		while ( i <10) {
			System.out.println(i+" always true");
			i++; 
		}
		
		// terminating loop earlier  
		// sometimes there are situations where we need to break out of the loop prematurely base on some condition and the way that is done is by using the break statement 
		i=0;
		while ( i <10) {
			System.out.println(i+" always true");
			if(i==8)
				break;
			i=i+1; 
		}
		
	}

}
