package StringExamples;

public class StringSplit {

	public static void main(String[] args){
		String str = "this\nstring\nwill\rsplit";
		for(String s : str.split("[\n|\r]"))
			System.out.println(s);
				
	}
}
