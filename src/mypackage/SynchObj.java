package mypackage;

public class SynchObj implements Runnable{

	int a=0,b=0;
	public SynchObj(int a,int b)
	{
	 this.a = a;
	 this.b = b;
	}
	
	public void add(int a,int b)
	{
			System.out.println("Sum "+ a+b);
		
	}
	
	public void run(){
	//	synchronized(this){
			add(a,b);
	//	}
	}
}