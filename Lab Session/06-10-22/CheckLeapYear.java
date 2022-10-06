/*
:WAP to Check for Leap Year.Take the input from the user
Author : AMit kumar
Date: 06-10-2022
*/


package CoreJava;
import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {

         // Creating Scanner object
		Scanner sc= new Scanner(System.in);
		
		//taking input from user
		System.out.println("enter a year for checking. is it a leap year or not");
		int enteredyear= sc.nextInt();
		
		//using if-else to decide a leap year
		if((enteredyear % 4==0)&&(enteredyear % 400==0)|| (enteredyear % 100 !=0)) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("it is not leap year");
		}
			
	
	
		
	}

}
