package com.geminno.three;

   class Phone {
	   String name;
	   String brand;
	   int price;
	   void call(){
		   System.out.println("打电话...");
	   }
	   void message(){
		   System.out.println("发短信...");
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
