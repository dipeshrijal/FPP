package prog3;

public class BinSearch {

	public static void main(String[] args) {
		String x = "afcikaeg";
		char c = 'e';
		System.out.println(recSearch(x,c));
	}
	
	public static boolean recSearch(String x, char c){
		int m = x.length() / 2;
		char ch = x.charAt(m);
		// first check if the desired char is found in the string
		if(x.indexOf(c) < 0 ){
			return false;
		}
		//System.out.println( "M i s "+ x);
		if(ch == c){
			return true;
		}
		else if(recSearch (x.substring(0,m),c)){
			return true;
		}
		else if(recSearch (x.substring(m+1),c)){
			return true;
		}
		
		return false;
	}

}
