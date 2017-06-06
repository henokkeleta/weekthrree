import java.util.ArrayList;

public class Resume {
	private String name;
	private String email;
	private ArrayList<String> Education;
	
	
	
	
	public Resume() {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email = email;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<String> getEducation() {
		return Education;
	}
	public void setEducation(ArrayList<String> education) {
		Education = education;
		}
		public String toString() {
			return "Resume [name=" + name + ", email=" + email + ", Education=" + Education + "]";
		}
	
}
