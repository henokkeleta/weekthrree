import java.util.Scanner;
public class loopThroughIt {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{   
			int x =i%3;
		    int y=i%5;
		    if((x==0)&&(y==0))
			{ 
				System.out.println("Fizz"+"Buzz");	
			}
		    else if(x==0)
			{ 
				System.out.println("Fizz");
			}
			else if(y==0)
			{ 
				System.out.println("Buzz");
			}
			
			else { 
				System.out.println(i);
			}
		}

	}

}
