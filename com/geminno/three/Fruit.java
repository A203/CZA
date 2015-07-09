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
		System.out.println("这是"+name+","+price+"元一斤"+" "+"卖到"+addr);
	}
public static void main(String[] args){
	Fruit fruit=new Fruit("苹果",8,"苏州");
	fruit.sell();
}

}
