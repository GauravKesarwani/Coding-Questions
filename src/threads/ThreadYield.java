package threads;


import java.util.ArrayList;
import java.util.List;
 
public class ThreadYield {
    public static void main(String a[]){
        List<ExmpThread> list = new ArrayList<ExmpThread>();
        for(int i=0;i<2;i++){
            ExmpThread et = new ExmpThread(i+5);
            list.add(et);
            et.start();
        }
        for(ExmpThread et:list){
            try {
                et.join();
            } catch (InterruptedException ex) { }
        }
    }
}
 
class ExmpThread extends Thread{
     
    private int stopCount;
    public ExmpThread(int count){
        this.stopCount = count;
    }
    public void run(){
        for(int i=0;i<50;i++){
        	
            if(i%stopCount == 0){
            	 System.out.println("Stoping thread: "+getName());
                 System.out.println("Value of i "+ i);
                System.out.println("Value of stopcount "+ stopCount);
                yield();
            }
        }
    }
}