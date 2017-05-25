import java.util.Scanner;

public class aomeThingAboutYou {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String firstName;
        int age=0;
       double height=0.0;
       double gpa=0.0;
       
       System.out.println("What is your first name?");
       firstName=scan.nextLine();
       System.out.println("What is your age name?");
        age=scan.nextInt();
       System.out.println("What is your height?");
       height =scan.nextDouble();
       System.out.println("What is your gpa?");
       gpa =scan.nextDouble();
       System.out.println("your name is:"+"  "+firstName);
       System.out.println("your age is:"+"  "+age);
       System.out.println("your height is:"+"  "+height);
       System.out.println("your gpa is:"+"  "+gpa);
       
	}

}
