
public class Fish extends Animal {
	public Fish(int age, String gender, int weightInLbs) { //When we create a fish object we pass the values over and those values will basically be carried over 
		super(age, gender, weightInLbs);  // into the super constructor to create a valid animal object. 
	}

public void swim() {
	System.out.println("swiming...");
}


public void move() {
	System.out.println("fish is swimming...");
	
}
}
