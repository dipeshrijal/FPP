package lesson2.scannerandreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderExample {

	public static void main(String[] args) {
		BufferedReader in = null;
		String input = null;
		in = new BufferedReader(new
  			 InputStreamReader(System.in));
		System.out.print("Type your name: ");
		try {
			input = in.readLine();
			System.out.println("You wrote " + input);
			in.close();
		} catch(IOException e) {
			e.printStackTrace();
		}


	}

}
