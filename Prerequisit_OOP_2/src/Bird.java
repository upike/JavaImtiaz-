
public class Bird extends Animal {
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs); // It's calling the superclass constructor it to create a bird object 
		
	}

	public void fly() {
		System.out.println("Flying..");
	}
}
