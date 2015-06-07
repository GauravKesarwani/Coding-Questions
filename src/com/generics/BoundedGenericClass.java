package com.generics;

public class BoundedGenericClass {
	public static void main(String[] args) {
		MyGadget<Mobile> sony = new MyGadget<>(new Mobile("Sony"));	

	}
}

class MyGadget<T extends Gadget> {
	private T g = null;
	public MyGadget(T param ){
		g = param;
	}
}


class Gadget {
	private String gadget;
	public Gadget(String s) {
		gadget = s;
	}
}

class Mobile extends Gadget {
	private String mobile;
	public Mobile(String mobile){
		super(mobile);
		this.mobile = mobile; 
	}
}
