import java.util.ArrayList;

public class ResumePublisher {
 
	
	private String name;
	private String email;
	private ArrayList<String> Education;
	private ArrayList<String> WorkExperience;
	private ArrayList<String> duty;
	public ArrayList<String> getDuty() {
		return duty;
	}
	public void setDuty(ArrayList<String> duty) {
		this.duty = duty;
	}
	private ArrayList<String> Skill;
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
	public ArrayList<String> getWorkExperience() {
		return WorkExperience;
	}
	public void setWorkExperience(ArrayList<String> workExperience) {
		WorkExperience = workExperience;
	}
	public ArrayList<String> getSkill() {
		return Skill;
	}
	public void setSkill(ArrayList<String> skill) {
		Skill = skill;
	}
	
	
}
