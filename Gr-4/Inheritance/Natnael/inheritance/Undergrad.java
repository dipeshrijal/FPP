package inheritance;

public class Undergrad extends Student {
	private double underWage;
	private double underHours;
	private String fname;
	public Undergrad(String fname, String ln, String dept, double underWage,double underHours){
		super(fname,ln,dept);
		this.underWage = underWage;
		this.underHours = underHours;
		//System.out.println(fname);
	}
	

	public double getSalary(){
		return underWage * underHours;
	}
	
	public void setName(String name){
		fname = name;
	}
	
	
	public String toString(){
		return String.format("Undergrad Student: First %s , Last %s , Department %s, Salary %s", getfirstName(), getLastName(), getDept(), getSalary());
	}
}
