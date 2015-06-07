/*How to read file content line by line in java?*/


package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadInJava {
	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		File f = new File("File1.txt");
		try {
			br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String strline;
		while((strline = br.readLine()) !=null)
			System.out.println(strline);
	}
}

