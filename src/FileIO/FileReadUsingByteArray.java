package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadUsingByteArray {
	public static void main(String[] args) throws IOException{
		
		FileInputStream is = new FileInputStream(new File("File1.txt"));
		byte[] content = new byte[256];
		int readCount=0;
		//while((readCount=is.read(content)) > 0)
		readCount = is.read(content);
			System.out.println(new String(content));
//	}
	}
}
