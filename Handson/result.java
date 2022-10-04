/* write a program to calculate a result of 5 subjects using if else Statement  who get above 60% will be passed other  
 failed
author : Amit kumar
date : 4-10-2022
*/

package CoreJava;
import java.util.Scanner;

public class result {

	public static void main(String[] args) {
		int math,english,phy,chem,phyedu;
		float percentage;
		float totalmarks=500;
		int marksobtain;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter math marks");
		math=sc.nextInt();
		
		System.out.println("enter english marks");
		english=sc.nextInt();
		
		System.out.println("enter physics marks");
		phy=sc.nextInt();
		
		System.out.println("enter chemistry marks");
		chem=sc.nextInt();
		
		System.out.println("enter physical education marks");
		phyedu=sc.nextInt();
		
		marksobtain= math+english+phy+chem+phyedu;
		System.out.println("your total obtain marks in all five subject is here:"+marksobtain);
		
		percentage=((marksobtain/totalmarks)*100);
		System.out.println("your total percentage is :"+percentage+"%");
		if(percentage>33.0) {
			System.out.println("congratulations you are pass");
		}
		else
			System.out.println("you are fail");
		
		
		
	}

}
