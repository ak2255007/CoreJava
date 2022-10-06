/* 
 * WAP to find reverse of a number
 * AUTHOR : AMIT KUMAR
 * DATE   : 06-10-22
 */


package CoreJava;
import java.util.Scanner;

public class reversenumber {

	public static void main(String args[]) {
		
	// Variable create
	int rem,rev=0;
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("enter a number");
	int number = sc.nextInt();  ///// 567
	
	//using whileloop
	while(number !=0) {
		 rem = number %10;
		 rev=rev*10 +rem;
		 number=number/10;
		
	}
	// for final print
	System.out.println(rev);
	

	}	
}
