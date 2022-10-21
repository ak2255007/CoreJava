// Write a Java program to calculate the average value of array elements.
// author Amit kumar
// 20-10-2022


import java.util.Scanner;
public class average {
public static void main(String args[]){

int sum=0; // initially sum = 0 

Scanner sc=new Scanner(System.in);
System.out.println("enter total number of subjects of an array");
int size=sc.nextInt();

int marks[]=new int[size];
// Initialize array

System.out.println("enter  marks  of arrays ");
//taking input in ana array 

for(int i=0;i<size;i++)
{
marks[i]=sc.nextInt();
}


// DIsplay elements of original array
System.out.println("your marks of subjects of an array is");
for(int i=0; i<size;i++)
{
System.out.println(marks[i]);
sum=(sum+marks[i]);
}

System.out.println("sum of your all subjects");
System.out.println(sum);
System.out.println("average of your subjects is");

// using average formula to calculate average
int average= (sum/size);
System.out.println(average);
}
}







