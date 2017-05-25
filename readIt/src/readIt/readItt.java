package readIt;

import java.util.Scanner;

public class readItt 
{


	public static void main(System[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first name");

		String firstInitial = keyboard.next(); 

		System.out.println("Enter the Last name");

		String lastName = keyboard.nextLine(); 

		System.out.println("Enter house Number");

		int houseNumber = keyboard.nextInt();

		System.out.println("Enter street name");

		String streetName = keyboard.nextLine();

		System.out.println("Enter Street type");

		String streetType = keyboard.nextLine();

		System.out.println("Enter the city name");

		String city = keyboard.nextLine();

		System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		System.out.println(streetName + " " + streetType + " " + city);
	} 



}
