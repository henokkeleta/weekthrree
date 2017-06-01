import java.util.Scanner;

class Division {
	public static void main(String[] args) {

		int a, b;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

		a = input.nextInt();
		b = input.nextInt();
		try{
			int result = a / b;
			System.out.println("Result = " + result);
		}catch (ArithmeticException e)
		{ 
			System.out.println("you tried to divide by zero!");
		}
		finally {
		    System.out.println("finally block will execute.");
		}
	}
}
