// Write a Java program to find the maximum and minimum value of an array.
// author Amit kumar
// 20-10-2022


import java.util.Scanner;
public class findminmax {
public static void main(String args[]){


Scanner sc=new Scanner(System.in);
//create scanner object

System.out.println("enter subjects of an array");
int size=sc.nextInt();


// Initialize array
int marks[]=new int[size];

System.out.println("enter  marks  of of your subjects ");

// taking input from user 
for(int i=0;i<size;i++)
{
marks[i]=sc.nextInt();    
}                       

System.out.println("your min marks of subjects of an array is");


// creating min variable 
int min = marks[0]; 

 
       for(int i=0; i<size; i++){
           if(min > marks[i])  
		   {
               min = marks[i]; 
           }
 
       }
	   System.out.println(min);
	   
	   System.out.println("your max marks of subjects of an array is");
	   
	   // creating max variable
	   int max = marks[0]; 

 
       for(int i=0; i<size; i++){
           if(max < marks[i])  
		   {
               max = marks[i]; 
           }
 
       }
	   System.out.print(max);
}
}