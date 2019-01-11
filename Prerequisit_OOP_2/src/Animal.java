
public abstract class Animal {
	int age;
	String gender;
	int weightInLbs;
	
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	public void eat() {
		System.out.println("eating...");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
	}
	public abstract void move();
	
}
//Abstract class is basically almost like a regular class except that it has abstract methods in it and an abstract class can only be extended. 
//You cannot instantiate an instance of an abstract class. It's only meant to be a parent or another class. 