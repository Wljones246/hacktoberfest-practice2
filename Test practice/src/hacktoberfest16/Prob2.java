/**
 * 
 */
package hacktoberfest16;

import java.util.Scanner;
public class Prob2
{
	public void main(String []args)
	{
		System.out.println("Enter Your First Name Please:");
		Scanner FName = new Scanner(System.in);
		String HelloFName = FName.nextLine();
		System.out.println("Eneter Your Last Name Please");
		Scanner LName = new Scanner(System.in);
		String HelloLName = LName.nextLine();
		System.out.println("Hello "+ HelloFName.substring(0,1).toUpperCase() + HelloFName.substring(1).toLowerCase() + " " + HelloLName.substring(0,1).toUpperCase() + HelloLName.substring(1).toLowerCase());
		
	}




}
