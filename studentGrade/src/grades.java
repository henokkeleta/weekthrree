/**
 * author Henok Berhe
 * date 05/28/2017
 * scores class prompt the user to enter the score and decide the score of the student
 * 
 */


import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		
		
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter your score here");
       int score = scan.nextInt();
       /**
        * using the score each if statments check the condition and decide the grade 
        */
       
       if(score>89)
       { 
    	  
    		   System.out.println("A"+sign(score));
    		   
        } else if(score >79)
        { 
        	System.out.println("B"+sign(score));
        }
        else if(score >69)
        { 
        	System.out.println("C"+sign(score));
        }  
        else if((score >=60 )&&(score <=69))
          { 
    	     System.out.println("D"+sign(score));
          }
       
        else 
        { 
        	System.out.println("F");
        }
       if(score >=60)
       { 
    	   System.out.println("Very good!you don't to retake the exam!");
       } else if (score <60)
       { 
    	   System.out.println("Did you even look at the book!");  
       }
        	
        
       

	}
	/**
	 * 
	 * @param score
	 * @return  String value, the sign that should be attached with the letter grade(either "+"/"-"
	 */
	public static String sign(int score)
	{ 
	  int remainder = score%10;
	  String x;
	  if(remainder>=7)
	  { 
		  x="+";
	  } 
	  else if(remainder<3) { 
		  x="-";
	  }else { 
		  x="";
	  }
	  return x;
	}
}
