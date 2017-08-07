package inheritance;

public class Main {
	public static void main(String[] args) {
		
		  Student sObj = new Student("Nati", "Getch", "Compro");
		  System.out.println(sObj);
		  
		  Grad gradObj = new Grad("Nati", "Getch", "Compro",1500);
		  System.out.println(gradObj);
		  
		  Undergrad ungradObj = new Undergrad("Natael", "Getchew",
		  "Compro",10,20); System.out.println(ungradObj);		
	}

}
