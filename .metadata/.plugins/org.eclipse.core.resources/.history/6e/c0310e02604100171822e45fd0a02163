package dayThree;
import java.util.Random;
import java.util.Scanner;
public class guessIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     String answer = "Y";
  
     Random r = new Random();
	  int x = 1+ r.nextInt(3); 
      
      while(answer.equalsIgnoreCase("y"))
      {  
    	  
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("guess any number between 1 and 10 and find my secret no");
    	  int input = scan.nextInt();
    	 
    	  if(input==x)
    	  { 
    		  System.out.println("you guessed right:");
    		  
    		 System.exit(0);
    	  }
    	  else if(input<x)
    	  {  
    		  System.out.println("you guessed too low:");
    		 //6 answer="y";
    	  }
    	  else
    	  { 
    		 
    		  System.out.println("too high:");
    		 // answer="y";
    	  }
    	  
    	  System.out.println("do u want to continue?");
		  answer=scan.next();
    	  
    	
      }
	}

}
