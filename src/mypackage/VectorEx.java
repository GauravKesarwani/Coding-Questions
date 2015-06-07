package mypackage;

import java.util.Vector;

public class VectorEx {
   public static void main(String[] args) {
      
    // create an empty array list with an initial capacity
    Vector<Integer> v = new Vector<Integer>(5);

    // use add() method to add elements in the list
    v.add(15);
    v.add(22);
    v.add(30);
    v.add(40);

    // let us print all the elements available in list
    for (Integer number : v) {
      System.out.println("Number = " + number);
    } 
	
    // retrieves element at 4th postion
    int retval=v.get(0);
	System.out.println("Retrieved element is = " + retval);	   
  
   
   for (Integer number : v) {
	      System.out.println("Number = " + number);
	    } 
   }
		
}   