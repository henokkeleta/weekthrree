import java.util.ArrayList;

public class Jobs extends Resume{
	private ArrayList<String> Job;
    public ArrayList<String> getJob() {
		return Job;
	}
	public void setJob(ArrayList<String> job) {
		Job = job;
	}
	public  ArrayList<String> DutyClas;
	public Jobs(String name, String email) {
		super(name, email);
		
	}
	public ArrayList<String> getDutyClas() {
		return DutyClas;
	}
	public void setDutyClas(ArrayList<String> dutyClas) {
		DutyClas = dutyClas;
	}
	public Jobs(String name, String email, ArrayList<String> dutyClas) {
		super(name, email);
		DutyClas = dutyClas;
	}
   
}
