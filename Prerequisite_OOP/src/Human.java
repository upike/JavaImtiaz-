
public class Human {
	
	/*// to jest moj konstruktor 
	 * public Human(String name, int age, int heightInInches, String eyeColor) {
	 * this.name=name; this.age=age; this.heightInInches=heightInInches;
	 * this.eyeColor=eyeColor; }
	 */
	public Human(String name, int age, int heightInInches, String eyeColor) { // right click-> source-> generate constructor using fields...
		super();
		this.name = name;  // this keyword is actually a variable in java and it points to the current object  
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	
	String name;
	
	int age;
	int heightInInches;
	String eyeColor;
	
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am  " + heightInInches + " inches tall");
		System.out.println("I am "+ age+ " years old");
		System.out.println("My eye color is "+ eyeColor);
	}
	public void eat() {
		System.out.println("I am eating...");
	}
	public void walk() {
		System.out.println("walking..." + this.name + " is walking");
	}
	public void work() {
		System.out.println("working...");
	}
}
