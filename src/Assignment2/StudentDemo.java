/**
 * 
 */
package Assignment2;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student stud = new Student();
		System.out.println("Enter a Student Age");
		stud.setAge(sc.nextInt());
		System.out.println("Enter a Student Marks");
		stud.setMarks(sc.nextInt());
		
		if(stud.getMarks() >= 70 && stud.getAge() < 15)
		{
			System.out.println("GRADE A");
		}
		else if((stud.getMarks() >=61 && stud.getMarks()<70)  && stud.getAge() < 15)
		{
			System.out.println("GRADE B");
		}
		else if(stud.getMarks() < 61 && stud.getAge() < 15)
		{
			System.out.println("GRADE C");
		}
			
	}

}
