package com.generics;

public class BoundExmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericInterfaceClass<Y> y = new GenericInterfaceClass<>(new Y());
		y.testrun();
		GenericInterfaceClass<Z> z = new GenericInterfaceClass<>(new Z());
		z.testrun();
	}
}

class GenericInterfaceClass<T extends X> {
	T param = null;
	public GenericInterfaceClass(T param){
		this.param = param;
	}
	public void testrun() {
		param.printElem();
	}
}

	interface X {
		public void printElem();
	}
	
	class Y implements X {
		public void printElem() {
			System.out.println("I am in class Y");
		}
	}

	class Z implements X {
		public void printElem() {
			System.out.println("I am in class Z");
		}
	}

