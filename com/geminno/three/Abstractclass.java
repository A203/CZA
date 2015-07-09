package com.geminno.three;

public class Abstractclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal= new Tiger();
		animal.sleep();
	}
}
 abstract class Animal{
	public abstract void sleep();
	
}
 class Tiger extends Animal{
	public void sleep(){
		System.out.println("ливек╞...");
	}
	
}
 class Monkey extends Animal{
	public void sleep(){
		System.out.println("яЖвек╞...");
	}
}
