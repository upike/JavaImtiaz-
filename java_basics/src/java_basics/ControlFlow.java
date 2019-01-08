package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
	// the idea of control flow comes from the keywords if else. Basically the idea to branch out into multiple directions

		boolean hungry = true ;
		
//		if (hungry) {
//			System.out.println("I am starving ...");
//			
//		}else {
//			System.out.println("I'm not hungry");
//			
//						
//		}
//		
	

		if (hungry==false) {
			System.out.println("I am starving ...");
			
		}else {
			System.out.println("I'm not hungry");
			
						
		}
		
		
		if (2==2) {
			System.out.println("I am starving ...");
			
		}else {
			System.out.println("I'm not hungry");
			
						
		}
		
		if (!hungry==false) {
			System.out.println("I am starving ...");
			
		}else {
			System.out.println("I'm not hungry");
			
						
		}
	
		int hungreRating =5;
		if (!(hungreRating <6)) { // if we do not put parenthesis  exclamation mark  compilator do not know if we negate hungreRating or hungreRating <6
			System.out.println("Not hungry ");
			
		}else {
					
			System.out.println("I'm starving!");
		}
		
		int favoriteTemp=75;
		int currentTemp=60;
		String opinion;
		
		if(favoriteTemp==currentTemp) {
			if(currentTemp<favoriteTemp-30) {
				opinion="It's Pretty Darn Cold...";
				
			} else if (currentTemp<favoriteTemp-20) {
				opinion="It's Kinda cold out...";
			}else if (currentTemp>=favoriteTemp +10) {
				opinion="It's hot out";
			}else {
				opinion="It's a beautiful day...";
			}
		}
		else {
			opinion="unknown temp";
		}
		System.out.println(opinion);
		
	
		// switch 
		
		int month=4;
		String monthString;
		
		switch(month) {
		
		case 1: monthString="January";
			break; // exit from switch 
		case 2: monthString="Febuary";
			break;
		case 3: monthString="March";
			break;
		case 4: monthString="April";
			break;
		default: monthString ="Unknown Month";
		}
		System.out.println(monthString);
		//.......
		
	}

}
