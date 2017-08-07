package lesson13.files;

import java.io.File;

public class FileDemo2 {
	static String loc = System.getProperty("user.dir")+"\\lesson13\\files\\";
	public static void main(String[] args) {
		File f1 = new File(loc + "word_test.txt");
		File f2 = new File("file_doesnt_exist");
		File d1 = new File(loc);
		//exists?
//		System.out.println(f1.exists());
//		System.out.println(f2.exists());
//		System.out.println(d1.exists());
		//type
		System.out.println(f1.isFile());
		System.out.println(d1.isDirectory());
		System.out.println("====================");
		//load all directories/files from a directory
		File[] filesAndDirs = d1.listFiles();
		for(File f: filesAndDirs) {
			System.out.println(f.getName());
		}
		System.out.println("====================");
		File d2 = d1.getParentFile();
		File[] filesAndDirs2 = d2.listFiles();
		for(File f: filesAndDirs2) {
			System.out.println(f.getName());
		}
	}
}
