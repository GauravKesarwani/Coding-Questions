package com.generics;

public class SampleGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass1<String> str1 = new GenericClass1<>("Gaurav");
		str1.displayInst();
		
		GenericClass1<Boolean> b = new GenericClass1<>(true);
		b.displayInst();

	}

}

class GenericClass1<T> {
	T instance1 = null;
	
	public GenericClass1(T param){
		instance1 = param;
	}
	
	public T getInst(){
		return instance1;
	}
	
	public void displayInst(){
		System.out.println("Type " + instance1.getClass().getName());
	}
}
