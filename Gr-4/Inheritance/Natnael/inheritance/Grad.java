package inheritance;

public class Grad extends Student {
	private double gradSalary;
	
	public Grad(){
		
	}
	
	public Grad(String fname, String lname, String dept, double gds){
		super(fname,lname,dept);
		gradSalary = gds;	
	}
	

	public double getSalary(){
		return gradSalary;
	}
	
	public String toString(){
		//System.out.println(super.toString());
		return String.format("GradStudent: First %s , Last %s , Department %s, Salary %s", getfirstName(), getLastName(), getDept(), getSalary());
	}
}
