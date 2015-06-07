/*
 * When two or more threads need access to a shared resource, they need some way to ensure that
 *  the resource will be used by only one thread at a time.

 The process by which this synchronization is achieved is called thread synchronization.

 The synchronized keyword in Java creates a block of code referred to as a critical section.
 Every Java object with a critical section of code gets a lock associated with the object. 
 To enter a critical section, a thread needs to obtain the corresponding object's lock.
 */

package mypackage;


public class SynchronizationEx{
	static int a=0,b=0;
	SynchronizationEx(int a, int b){
		
	}
	
	 static public void main(String[] args)
	{
		System.out.println("Example of Synchronozed block");
		SynchObj obj1 = new SynchObj(2,3);
		SynchObj obj2 = new SynchObj(4,4);
		SynchObj obj3 = new SynchObj(4,7);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}


