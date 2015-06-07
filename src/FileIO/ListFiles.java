//List all the files in directory in java

package FileIO;

import java.io.File;

public class ListFiles {
	
	public static void main(String[] args)
	{
		File f = new File("/home/gauravkesarwani/workspace/JavaPractice/");
		String[] flist=f.list();
		for(String i:flist)
			System.out.println(i);
	}

}
