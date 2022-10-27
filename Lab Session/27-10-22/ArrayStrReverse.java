/* Wap to sort String in Reverse order
 author-- Amit kumar
 Date-- 27 Oct 2022 
 */
package CoreJava;

import java.util.*;

public class ArrayStrReverse {

	public static void main(String[] args) {
		// 
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string");
		
		// taking String from user
		String arr=sc.nextLine();
		char a[]=arr.toCharArray();
		System.out.println("reverse of a String is :");
     int i=a.length;
     
     // logic to print reverse
     for(int j=i;j>0;j--) {
    	 System.out.print(a[j-1]);
     }
	}

}