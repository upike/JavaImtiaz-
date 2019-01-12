package practice.loops;

public class LoopPracticeFor {

	public static void main(String [] srala) {

		//		String str= "verylongstringfdafdfgdfgdffalj";
		//		System.out.println(str);
		//		for(int i=0; i<=str.length()-1 ; i++) {
		//
		//			System.out.println(str.charAt(i));
		//
		//		}
		//
		//		for(int i=str.length()-1; i>=0 ; i-- ) {
		//
		//			System.out.println("char at " + str.charAt(i));
		//		}


		for(int i =0 ; i<=10; i++) 
		{
			System.out.print("*");
			for(int j=0 ; j<=i ;j++) 
			{
				System.out.print("+");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=10 ; i>=0; i--) 
		{
			System.out.print("*");
			for(int j=0 ; j<=i ;j++) 
			{
				System.out.print("+");
			}
			System.out.println();
		}
		
		// tabliczka mno¿enia
		for (int i =1; i<=20 ; i++) 
		{
		//	System.out.print(i+" ");
			for(int j=1; j<20; j++)
			{
				System.out.print(j*i +" ");
				
			}
			System.out.println();
		}
			
	}
}
