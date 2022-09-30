/*program for calculation
@auther : Amit kumar
date : 29-09-22
*/

package CoreJava;
import java.util.Scanner;
class calculation
{
public static void main(String args[])
{
	
// creating variable
int a,b,c;
int add;
int sub;
int multiplication;
int division;

// creating Scanner object
Scanner sc = new Scanner(System.in);

// taking first value from user
System.out.println("enter  first value ");
a= sc.nextInt();

// taking second value from user
System.out.println("enter  second  value ");
b= sc.nextInt();

// Giving choice to user
System.out.println("enter 1 : if u want addition ");
System.out.println("enter 2 : if u want substraction ");
System.out.println("enter 3 : if u want multiplication ");
System.out.println("enter 4 : if u want division ");
c= sc.nextInt();

// use ifelse 
if(c==1)
{
add= a+b;
System.out.println("the addition of a and b is " +add);
}
else if(c==2)
{
sub=a-b;
System.out.println("the substraction of a and b is " +sub);
}
else if(c==3)
{
multiplication= a*b;
System.out.println("the multiplication of a and b is " +multiplication);
}

else if(c==4)
{
division= a/b;
System.out.println("the division of a and b is " +division);
}

else 
{
System.out.println("invalied input ");
}
}
}
