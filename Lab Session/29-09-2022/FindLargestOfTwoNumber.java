/* 
Create a program to find largest of two numbers.
@auther : Amit kumar
date : 29-09-22
*/
package CoreJava;
import java.util.Scanner;

class FindLargestOfTwoNumber 
{
	public static void main(String args[])
	{
		// creating Scanner object
		Scanner sc= new Scanner (System.in);
		
		//taking first value from user
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		
		//taking second value from user
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		
		// using conditionals for decide which number is larger
		if(num1>num2)
		{
			System.out.println(num1+ "is larger");
		}
		else
		{
			System.out.println(num2+ "is larger");

		}
		
	}
	

}
