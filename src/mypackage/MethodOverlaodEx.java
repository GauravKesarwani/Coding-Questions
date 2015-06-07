package mypackage;

public class MethodOverlaodEx {

	public static void JavaOverload(Object o){
		System.out.println("Object");
	}
	
	public static void JavaOverload(String s){
		System.out.println("String");
	}
	
	public static void JavaOverload(Integer s){
		System.out.println("String");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaOverload(10);
		
		if (null == null)
			System.out.println("Nulls are equal");
	}

}
