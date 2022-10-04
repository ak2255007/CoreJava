/* write a program to check applicability of a person for
 * author:Amit kumar
 * date: 04-10-22
 */

package CoreJava;
import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("you can vote");
		}
			else
				System.out.println("you can't vote,   Ghar jao bache");

	}

}
