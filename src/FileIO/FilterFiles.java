package FileIO;

import java.io.File;
import java.io.FilenameFilter;

public class FilterFiles {
	public static void main(String[] args){
		File f = new File("/home/gauravkesarwani/workspace/JavaPractice/");
		File[] listf = f.listFiles(new FilenameFilter(){
		@Override
		public boolean accept(File dir,String name){
			if(name.toLowerCase().endsWith(".txt"))
				return true;
			else 
				return false;	
		}	
	});
	
		for(File f1: listf)
			System.out.println(f1.getName());
	}
}
