package com.geminno.three;

public class Fruit {
	String name;
	int price;
	String addr;
	Fruit(){}
	Fruit(String n,int i, String add){
		name=n;
		price=i;
		addr=add;
	}
	void sell(){
		System.out.println("����"+name+","+price+"Ԫһ��"+" "+"����"+addr);
	}
public static void main(String[] args){
	Fruit fruit=new Fruit("ƻ��",8,"����");
	fruit.sell();
}

}
