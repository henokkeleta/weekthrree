import java.util.ArrayList;
import java.util.Scanner;

public class ResumePrinter {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Jobs job1 = (Jobs) new Resume();
		ArrayList<String> education=new ArrayList<String>();
		job1.setName("Hen");
		job1.setEmail("heniken05");
		//job1.setEducation();
		System.out.println("enter eduation "); 
		 
		job1.DutyClas.add("testing");
		job1.DutyClas.add("enjoying");
		job1.DutyClas.add("teaching");
		job1.DutyClas.add("evaluating");
  String input="";
		do
		{ 
			input =sc.nextLine();
			if(input.equalsIgnoreCase("n"))
			{ 
				break;
			}
			education.add(input);
			System.out.println("more? if you are done type N");

		}while(!input.equalsIgnoreCase("N"));

	}

}
