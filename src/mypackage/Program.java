package mypackage;


public class Program { 
    public static void main(String[] args) {
        try { 
        	System.out.println("The first time calls forName:");
            Class c   = Class.forName("com.xyzws.AClass"); 
            
            try {
				com.xyzws.AClass a = (com.xyzws.AClass)c.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("The second time calls forName:");
          //Class has been loaded so there is not "static block in AClass" printing out
            Class c1 = Class.forName("com.xyzws.AClass");
        } catch (ClassNotFoundException e) {
        }
        
    }
}