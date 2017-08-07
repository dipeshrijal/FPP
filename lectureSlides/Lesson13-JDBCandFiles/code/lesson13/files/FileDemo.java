package lesson13.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileDemo {
	String loc = System.getProperty("user.dir")+"\\lesson13\\files\\";

	public static void main(String[] args) {
		new FileDemo();
	}

	public FileDemo() {
		//working directory
		System.out.print("JVM will look for files in here: ");
		System.out.println(System.getProperty("user.dir"));
		System.out.print("To specify a file in current package, go here: "); 
		System.out.println(System.getProperty("user.dir")+"\\lesson13\\files");
		
		try {
			//scanText();
			//readText();
			writeText();
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}		
	}
	void writeText() throws IOException {
		File f= new File(loc+"word_test.txt");
		PrintWriter writer = new PrintWriter(new FileWriter(f));
		writer.write("new values");
		writer.close();
	}
	void readText() throws IOException {
		File f = new File(loc+"word_test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		String firstLine = reader.readLine();
		/*
		 * To read many lines, loop like this:
		 * String line = null;
		 * while((line = reader.readLine()) != null) {
		 * 	//do something with the line
		 * }
		 * 
		 */
		StringTokenizer tokenizer = new StringTokenizer(firstLine," ,");
		String word = null;
		while(tokenizer.hasMoreTokens()){
			System.out.println(tokenizer.nextToken());
		}
		reader.close();
		
		
	}
	void scanText() throws IOException {
		File f = new File(loc+"word_test.txt");
		Scanner s = new Scanner(f);
		String word = null;
		try {
			
			while( (word = s.next()) != null){
				System.out.println(word);
			}
		}
		catch(NoSuchElementException e){
		}
		s.close();		
	}
}
