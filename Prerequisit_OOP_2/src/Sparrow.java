
public class Sparrow extends Bird implements Flyable { // implements Flyable means that we need to define here the abstract methods from that interface in this case it is fly() method. 

	public Sparrow(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);  // key words like super, public, new are written with lower cases 
		
	}

@Override
public void fly() {
	System.out.println("Sparrows flying high...");
	
}

}
// Interface is a contract 
// any class that implements that interface the interface wants that class to promise that it will 
// implement that method. 
// Now a key thing to remember is a class can only extend one class one other class. Only One! 
// So it can only have one parent and that makes sense. 
// Any class cannot have multiple parents but it can have as many interfaces as it wants. 

