/*
 Program : To check password is correct or not
 @Author : AMIT KUMAR
 Date : 06-10-22
 */

package CoreJava;
import java.util.Scanner;


public class passwordcheck {

	public static void main(String[] args) {

		//creating object of scanner class
		Scanner sc = new Scanner(System.in); 
		
		//printing statement
		System.out.println("Enter username :"); 
		//taking input from the user
		String username = sc.nextLine();  
	 
		
		//printing statement
	 System.out.println("Enter password :");  
	 
     	//taking input from the user
		int password = sc.nextInt(); 
	 
		//using if-else statement
		if (password ==1111)  
	 {
			//printing statement
		 System.out.println(" Login successful"); 
	 }
	 else
	 {
		//printing statement
		 System.out.println(" Login failed "); 
	 }

	}

}
