package threads;

public class SimpleThreads {
	static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s %s",threadName, message);
	}

	private static class MessageLoop implements Runnable {
		public void run(){
			String importantInfo[] = {
					"Imp info 1",
					"Imp info 2",
					"Imp info 3",
					"Imp info 4"
			};
			try {
				for (int i=0; i< importantInfo.length; i++){
					Thread.sleep(4000);
					threadMessage(importantInfo[i]);
				}
			}catch(InterruptedException ie){
				threadMessage("i wasn't done");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		long patience = 1000 * 60 * 60;
		
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		threadMessage("Waiting for MessageLoop to finish");
		/*
		 * isAlive() method is used to check if a thread has finished execution or is still running
		 * 
		 */
		
		while(t.isAlive()){
			threadMessage("Still waiting ...");
			
		/*
		 * this method waits until the thread on which it is called has terminated
		 *
		 * 
		 */
			t.join(1000);
			if((System.currentTimeMillis() - startTime) > patience && t.isAlive()){
				threadMessage("Tired of waiting");
				t.interrupt();
				t.join();
			}
		}
		threadMessage("Finally");
	}
}