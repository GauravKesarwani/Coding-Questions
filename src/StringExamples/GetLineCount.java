package StringExamples;

public class GetLineCount {
	public static void main(String[] args) {
		String str = "line1\nline2\nline3\rline4\rline5";
		int c = getLineCount(str);
		System.out.println(" Line Count "+ c);
	}
	
	public static int getLineCount(String str){
		return str.split("[\n | \r]").length;
	}

}
