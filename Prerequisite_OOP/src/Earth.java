
public class Earth {

	public static void main(String[] args) {

	Human tom; // let's define variable of type Human than we need assign this variable a value
	tom= new Human("Tom",19,76,"black"); // we assign tom's variable object // the actual object is created when this statement is executed ->  new Human("Tom",19,76,"black");
	tom.eyeColor="green";
	
	Human human1= new Human("Londo", 69, 70, "Green");
	// so this "new" keyword is the thing that is used when calling the constructor method to create a new object;
// tom is just variable is not an object. Objects come into existence when the application starts up. 	
//	tom is an instance variable. It point's to the actual object the actual instance of it and it's referred to as an instance variable.  
	// object will be created once the program is running. 
	tom.speak(); // We're invoking the speak method on that object so we're basically asking Tom to speak. 
human1.speak();
	}

}
