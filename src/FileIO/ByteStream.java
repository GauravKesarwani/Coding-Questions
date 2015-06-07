package FileIO;

/* This program reads bytes of data from input file and writes it to output file(one byte at a time).
 *  Low level I/O that you should avoid
 * 
 * Closing a stream in finally block helps avoid serious resource leaks.
 *
 * All byte stream classes are descended from InputStream and OutputStream
 * */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException{
		FileInputStream fin = new FileInputStream("File1.txt");
		FileOutputStream fout = new FileOutputStream("bytestr.txt");
		int c;
		try{
			while ((c = fin.read()) != -1){
				fout.write(c);
			}
		}finally {
			
			/* This check ensure that file was initially found and opened. Only then close it*/
			if(fin !=null){
				fin.close();
			}
			
			if(fout !=null){
				fout.close();
			}
		}
	}
}
