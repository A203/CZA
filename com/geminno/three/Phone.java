package com.geminno.three;

   class Phone {
	   String name;
	   String brand;
	   int price;
	   void call(){
		   System.out.println("��绰...");
	   }
	   void message(){
		   System.out.println("������...");
	   }
	   

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone=new Phone();
		phone.call();
		phone.message();

	}

}
