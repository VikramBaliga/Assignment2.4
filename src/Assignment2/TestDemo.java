/**
 * 
 */
package Assignment2;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		
		if(number==0)
		{
			System.out.println("You Have Entered Zero");
		}
		else if(number > 0)
		{
			System.out.println("You Have Possitive Value");
		}
		else
		{
			System.out.println("You Have Negative Value");
		}
	}
}
