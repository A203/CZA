package com.geminno.three;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M c=new N();
		System.out.println(c.a);
		c.hello();

	}

}
class M{
	String a="A";
	 void hello(){
		System.out.println("A...");;
	}
}
class N extends M{
	String a="B";
	void hello(){
		System.out.println("B...");
	}
}
