package com.geminno.three;

public class Person {
	String name;
	int age;
	String address;
	Person(String name ,int age){
		this.name=name;
		this.age=age;
	}
	Person(String name,int age,String address){
		this(name,age);
		this.address=address;
	}
	void hello(){
		System.out.println("���...");;
	}
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
		this.hello();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person("���Ӱ�",20,"�Ϸ�");
		person.introduce();
	}

}
