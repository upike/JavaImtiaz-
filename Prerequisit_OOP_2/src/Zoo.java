
public class Zoo {

	public static void main(String[] args) {
		Animal animal1=new Animal(3,"Mail", 23);
		
		animal1.eat();

		Fish fish1;
		fish1=new Fish(2, null, 7);
		fish1.swim();
		
		Bird bird1=new Bird(12, "Male", 1 );
		//bird1.fly();
		bird1.eat(); // after extending class Bird from Animals we can use Methods from Animals class's  like e.g. eat(); 
		bird1.sleep(); 
	//	animal1.fly();   // we can not use method from child to parent class object - The parents should not be able to inherit from the child. 
		// In Java everything that all the method visibility is driven by the variable type!
		// the whole point is code organization that's what object oriented gives you. I don't want you to miss the entire point and that is to organize your code better.
		// That's what object oriented programming provides you. 
		// that is why we decided to extend the Animal class. 
		// we made Bird extend the animal class because a bird is an animal.
		// And if we didn't have the ability to extend animal we;d have to copy over the method. 
		// For example in the bird in the Animal class we'd have to copy over these two methods into the bird class.  
	Chicken chicken1=new Chicken(12, "kogut", 13);
//	chicken1.fly();
	chicken1.eat();
	
	}

}
