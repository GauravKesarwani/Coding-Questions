package FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWrite {
	
	public static void main(String[] args)
	{
		BufferedWriter bw=null;
		try {
		File f = new File("File2.txt");
		
		if(!f.exists())
			f.createNewFile();
			
		Writer w = new FileWriter(f);
		bw = new BufferedWriter(w);
		
			bw.write("This is an example of file write");
		}catch(IOException io){
			io.printStackTrace();
		}
		finally{
			try{
			if (bw!=null) bw.close();
			}catch(Exception ex){}
		}
	}

}
