package lesson2.datatypeconversion;

public class DataConversion {

	public static void main(String[] args) {
		//int -> long, int -> double automatic, no loss of info
		int x = 123456789;
		long y = x;
		double w = x;
		System.out.printf("%d, %d, %f\n", x, y, w);
		
		
		//int -> float, long -> float, long -> double: automatic but may lose info
		int a = 123456789;
		float b = a;
		long c = 123456789123456789L;
		float d = c;
		double e = c;
		System.out.printf("%d, %f,\n%d, %f, %f\n", a,b,c,d,e);
		
		//char -> int - automatic
		char s = 'a';
		int t = s;
		System.out.printf("%c, %d", s, t);

	}

}
