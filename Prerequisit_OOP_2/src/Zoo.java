
public class Zoo {

	public static void main(String[] args) {
		/*
		 * Animal animal1=new Animal(3,"Mail", 23);  // since we make Animal class an abstract one we cannot create an object of type Animal. 
		 * 
		 * animal1.eat();
		 */

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
	
	
		
	Sparrow sparrow1=new Sparrow(44,"samiec Jack", 56); 
	sparrow1.move();   
		
	Bird sparrow2 = new Sparrow(5, "Male", 7); // we can create variable type Bird sparrow 2 that point to object of type Sparrow (because sparrow is a descendant of Bird)
	sparrow2.eat();  // type of sparrow2 decides of available methods for object that it point at. Here our sparrow2 has available methods that Bird has and Bird's parent 
	// sparrow2 does not have(She has red hair, she does not have black hair. After auxiliary do (do, does, did) you must use the plain form of the verb.) METHODS 
	// 	available for Sparrow class because the variable that points at it is of type Bird. 
	
	Animal sparrow3 = new Sparrow(5, "Male", 7); // when we use other type variable, the parent's one  that points at our object , we reduce available methods for this object  
	sparrow3.eat(); // the methods that we can invoke on Variables are based on the type specification so special on if I want to make Sparrow3  fly I can't do that
	// animal is an abstract class (we can not create an instance of it (object of this type)) but we can use  variable of this type to point at object of decendant's class 
	Fish fish2=new Fish(8, "obojniak", 9);
	fish2.move();
	Animal fish3 =new Fish(5,"male",7);
	fish3.sleep();
	
	//***************************************************
	System.out.println();
	Animal sparrow4=new Sparrow(44,"samiec Jack", 56);  // though the animal type specification I can invoke them move 
	sparrow4.move();   // but when application runs the actual object's behavior will be different because this object is actually a sparrow and the fish beneath is actually a fish
	// this allows for making things more dynamic and generalized. For example if I want to create a method in the zoo class. Let's create beneath another method. 
	Animal fish4 =new Fish(5,"male",7);
	fish4.move();
	System.out.println();
	//*********************************
	moveAnimals(sparrow4); // in this method we are passing in fish4 which is an instance variable and we are passing in sparrow4 which is an instance that is pointing to 
	moveAnimals(fish4); // to the object that will get created when we run this application  OBJECTS EXIST WHEN APPLICATION RUNS
	
	Flyable flyingBird =new Sparrow(2,"m",9);
	flyingBird.fly(); // we have created a variable of Type Flyable that point to object of type Sparrow and our FlyingBird variable 
// has only available methods that are define in Flyable interface in this case only fly(); 
		/* Flyable flyingBird2=new Bird(1,"m",7); */ // Sparrow implements the Flyable interface and Bird does not implement Flyable interface so Variable of type Flyable cannot points to object of type Bird
	
	}
	public static void moveAnimals(Animal animal) {
		animal.move(); // Now All i have to do is call animal.move() and this particular method called move animals works for any kind of animal. 
	}

}
