package com.exceptions;

public class ThrowsEx {
	public static int divide(int numberToDivide, int numberToDivideBy) {
		  //  throws BadNumberException
			try {
		        if(numberToDivideBy == 0){
		            throw new BadNumberException("Cannot divide by 0");
		        }
			}catch(Exception e){System.out.println("Exception thrown");}
		        return numberToDivide / numberToDivideBy;
		    }
	public static void main(String[] args){
		divide(10,0);
	}

}


class BadNumberException extends Exception {
	String s;
	public BadNumberException(String s){
		this.s = s;
	}

}