
public class MySingleton {
	
	private static MySingleton INSTANCE = new MySingleton();
	
	private MySingleton() {
	}
	
	public static MySingleton getInstance()
	{
		return INSTANCE;
	}

	public void works(){
		System.out.println("This works");
	}
	
	public static void main(String[] args)
	{
		MySingleton m = getInstance();
		m.works();
	}
}
