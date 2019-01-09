
public class Bird extends Animal {
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs); // It's calling the superclass constructor it to create a bird object 
		
	}

	/*
	 * public void fly() { System.out.println("Flying.."); } // insted of this method here we create an Interface to solve the problem that not all birds can fly.
	 */
// We need create an interface and Interface is basically a contract and any class that implements that interface it becomes
	// compulsory(obowi¹zkowy, przymusowy) for that class to implement the methods that are defined and then in that interface. 
	// Let me show you what I mean. Let's create an interface for a new and we're going to call this Interface Flyable 
	// We were naming it after the functionality that we are trying to abstract away that's what interfaces should be named after 

}
