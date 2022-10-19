//.Program to input 10 numbers in an array and display only the even numbers if present in the array.
//author Amit kumar
//19-10-2022

import java.util.Scanner;
public class Toprintonlyevennumber{
public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("enter a size of an array");
int size= sc.nextInt();


int nums[]=new int[size];


System.out.println("enter  elements of arrays ");
for(int i=0;i<size;i++){
nums[i]=sc.nextInt();
}

System.out.println("your even elements in array is ");
for(int i=0;i<size;i++)         
{                             
if (nums[i]%2==0){
System.out.println(nums[i]);
}

}
}
}

