/* program to find Second Largest Number
 Author-- Amit kumar
 Date-- 20 Oct 2022
 */
 
 
package CoreJava;

import java.util.Scanner;

public class secondlar {

	    public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		//taking  size of Array by User
        System.out.println("enter size of array");
        int a=sc.nextInt();
        
       //Declaring size of Array
        int arr[]=new int[a];
        
        //taking element from user
        System.out.println("enter the element");
        for(int i=0;i<a;i++) {
        	arr[i]=sc.nextInt();
        	 }
        // logic finding Second Largest Number
        int max=arr[0];
        int scnd=arr[0];
        
        //find Maximum number  
        for(int i=0;i<a;i++) {
        	if(max<arr[i]) {
        		max=arr[i];
              }}
        //find Second largest number
        for(int i=0;i<a;i++) {
        	if(max>arr[i]&&scnd<arr[i]) {
        		scnd=arr[i];
        	   }
	}System.out.println("the second Largest Number is :"+scnd);

}
}