package FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * All character stream classes are descended from Reader and Writer.
 * 
 * */
public class CharacterStream {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("File1.txt");
		FileWriter fw = new FileWriter("charstr.txt");
		
		int c;
		try{
			while ((c=fr.read()) != -1){
				fw.write(c);
			}
		}finally{
			if (fr != null)
				fr.close();
			
			if (fw != null)
				fw.close();
		}
	}
}
