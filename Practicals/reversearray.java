// program to reverse an array
// Amit kumar
// 21-10-22


import java.util.Scanner;
public class reversearray {
public static void main(String args[]){


Scanner sc=new Scanner(System.in);
//create scanner object

System.out.println("enter size of an array");
int size=sc.nextInt();


// Initialize array
int nums[]=new int[size];

System.out.println("enter  elements of an array ");

// taking input from user 
for(int i=0;i<size;i++)
{
nums[i]=sc.nextInt();    
}             
System.out.println("your array is ");
//for printing array elements
for(int i=0;i<size;i++){
System.out.println(nums[i]);
}          
System.out.println("your reverse array is");
for(int i=size-1; i>=0; i--){
	System.out.println(nums[i]);
}


}
}