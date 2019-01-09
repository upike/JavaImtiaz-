
public class Chicken extends Bird {
	public Chicken(int age, String gender, int weightInLbs) {
		super(age,gender, weightInLbs);
	}
	// chickens don't fly but in Bird class we have fly(); method so we have two options or remove this method from Bird class and create an Interface (7:30min) because there is plenty of birds that can not fly
	// we can overwrite this this methods 
//	public void fly() {  // Here is where we define a specific method for chicken called Fly and in it we are saying that chicken do not fly
//		System.out.println("Chicken don't fly"); // This is actually called overriding. Override = Replace
	//}
}
