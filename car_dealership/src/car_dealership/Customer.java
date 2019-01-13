package car_dealership;

public class Customer {
	
 private String name;
private	String address;
private	double cashOnHand;
private boolean isWantCredit;
	
public String getName(){
	return name;
}
public void setName(String name) {
 this.name=name; 
}
 public String getAddress() {
	return address;
}
public void setAddress(String address) {
	//address= address+" Dealership City"; 
	address +=" Dealership City" ;
	this.address = address;
}
public double getCashOnHand() {
	
	return cashOnHand;
}
public void setCashOnHand(double cashOnHand) {
	cashOnHand+=500;   // we want to give every customer a bonus 500$ 
	this.cashOnHand = cashOnHand;
}

public void setIsWantCredit(boolean isWantCredit) {
	this.isWantCredit=isWantCredit;
}
public boolean getIsWantCredit()
{
	return isWantCredit;
}

public void introduceYourself(Customer cust) {
	System.out.println("Hello I am " + cust.getName());
}


	
	
	
	
	
	
	
public void purchaseCar(Vehicle vehicle,Employee emp, boolean finance) { // and finance when we invoke the purchase car method in dealership Class there's a dealership class 
// we're going to create an instance of customer and that guy is going to invoke its purchase car method and he's going to pass in 
// the details what vehicle he wants, what employee he has chosen to get help from and then the third argument is finance whether he wants to finance the car or not. 

	System.out.println("I want to buy "+ vehicle.getColor() + " " + vehicle.getMake() + " " + vehicle.getModel() );
	
}

}



/**
 * can encapsulate that functionality in methods rather than directly willy nilly giving users the ability

to change the variables directly.

You don't want to do that.

And this is going to be a common theme that's going to come up over and over again in this course in

cancellation and you're slowly going to begin to understand it but I'm going to introduce that to you

here superficially and we're going to see a lot more of this throughout the course.

superficially- powierzchownie
 * 
 */

// willy-nilly  na chybi³ trafi³ chc¹c nie chc¹c

/*
 * If we didn't have the set address someone may have just willy nilly added an
 * address and that would
 * 
 * not conform with our system our system.   // conform - odpowiadaæ
 */


//Make sure you do your due diligence to try this out.
//Due diligence (z ang. nale¿yta starannoœæ) 
/*
 * Really work hard on it.
 * 
 * Struggle with it if you have to.
 * 
 * That's going to make all the difference.
 */