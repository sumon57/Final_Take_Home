package finalExamHome;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingAFile {

	public static void main(String[] args) {
		String filepath = "SampleDictionary.txt";
		doesFileExist(filepath);

	}

	private static void doesFileExist(String path) {
	
		try {
			Scanner scan = new Scanner(new File(path));
			System.out.println("Path to file exists");

			while (scan.hasNextLine()) {
				String str=scan.nextLine();
				String[] res = str.split("[-\\,]",0);

				for (String myStr: res) {
					System.out.println(myStr.trim());
			
				}
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}


}
