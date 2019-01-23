package Lesson4;

public class Employee implements Comparable<Employee> {   //Now this class is implementing the comparable interface so it's bound to implement all of the methods that are specified in the comparable interface.
	String name;
	int salary;
	String department;
	
	public Employee(String name, int salary, String department) {
		super();
		this.name=name;
		this.salary=salary;
		this.department=department;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the department
	 */
	public String getDepartament() {
		return department;
	}

	/**
	 * @param departament the department to set
	 */
	public void setDepartament(String department) {
		this.department = department;	
	}

	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	@Override
	public int compareTo(Employee o) {
		 
		if(this.salary> o.salary) {   
			return -1;               //Negative One means it's going to be smaller than the employee that's passed in as an argument to this  method.                                                                     // nie czytaæ tego nie bylo tematu: > o.salary > can not make a STATIC reference to no static-field Employee.salary 
		}else if (this.salary<o.salary) {
			return 1;  // method and positive one means that this employee either instance their salary is going to be larger than the employee that's passed in 
		}
		return 0;
	}
	/*   ^^
	 * In this employee class and compare two employees one employee is going to be
	 * the instance of this class
	 * 
	 * and the other employees are going to be passed in as an argument to this
	 * compared to method.
	 * 
	 * And this all happens behind the scenes.
	 * 
	 * We don't have to specifically call compared to method.
	 * 
	 * Java takes care of it for us.
	 */
}
