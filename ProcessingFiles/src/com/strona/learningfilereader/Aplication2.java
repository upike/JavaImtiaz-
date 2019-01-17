package com.strona.learningfilereader;


class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing...Here should be all the things that we should close \n I'am invoking automatically on instance of MyClass because this class implements AutoCloseable so we can use it with try with recourses block");
		
	}
	
	
	
}


public class Aplication2 {

	public static void main(String[] args) {
	
		try (MyClass varmyclass=new MyClass()){
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("We could still use finaly block with try construction but we acctualy do not need it any more because 99 % it was used to close recourses but sinc try with recources do it automaticaly threre is no need to use it");
		}

	}

}
// Closing...Here should be all the things that we should close\n I'am invoking automatically on instance of MyClass because this class implements AutoCloseable so we can use it with try with recourses block