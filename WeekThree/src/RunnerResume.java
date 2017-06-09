
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class  RunnerResume
{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from ResumeMembers";
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Resume?"
                                + "user=root&password=password");
            ResumeDefinition  person=new ResumeDefinition ();
            
      	    Job person1=new Job();
      		
      		System.out.println("enter your Email");
      		String email=sc.nextLine();
      		person.setEmail(email);
      		 stmt= con.prepareStatement("Insert into ResumeMembers(Email) values(?)");
      		 stmt.setString(1,person.getEmail());
      		 stmt.executeUpdate();
      		rs = stmt.executeQuery(sql);

      		System.out.println("enter your Educational achivemnts");
      		
      		
      		
      		 String education=sc.nextLine();
      		 person.setEducation(education);
      		 stmt= con.prepareStatement("Insert into ResumeMembers(Education) values(?)");
      		 stmt.setString(1,person.getEducation());
      		 stmt.executeUpdate();

     		person.setWorkExperience(person1.addJobs());
     		person.setSkill(person1.addSkills());
     		System.out.println(person.getFullName());
     		System.out.println(person.getEmail()+"\n");
     		System.out.println("EDUCATION");
     		System.out.println("________________");
     		System.out.println(person.getEducation());
     		System.out.println("WORK EXPERIENCE");
     		System.out.println("________________\n");
     		System.out.println(person.getWorkExperience());
     		System.out.println("Skills");
     		System.out.println("________");
     		System.out.println(person.getSkill());
     		while(rs.next()){
				String d = rs.getString("Email");
				System.out.print(d);
				
				//System.out.print(rs.getString("LastName"));
				//setFullname(d);
				System.out.println();
				String ed= rs.getString("Education");
				System.out.println(ed);
				String wex =rs.getString("WorkExpreience");
				System.out.println(wex);
				String skl=rs.getString ("Skill");
				System.out.println(skl);
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	
}

     	

     	
     	public static String displayEducation()
     	{  
     		String alleducation="";
     		boolean more=false;
     		while(!more)
     		{  

     		
     		System.out.println("Enter educational achievments/degree and In what feild of study you graduated:\n Use this format:Bsc.in Computer science");
     		String inputz=sc.nextLine();
     		if(inputz.equalsIgnoreCase("no"))
     		{   
     			inputz="" ;
     			more=true;
     			break;
     		}
     		String degree=inputz;

     		System.out.println("From which university you Graduated?");
     		String university=sc.nextLine();
     		System.out.println("When did you Graduated?");
     		String graduated=sc.nextLine();
     		System.out.println("more Educational history? If you are done, type NO");

     		
     		alleducation=alleducation+degree+"\n"+university+","+" "+graduated+"\n";
     		}
     		return alleducation;
     	}
     


			
}