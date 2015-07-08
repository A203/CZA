package com.geminno.two;

public class sanjiaolianxi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=13;i++){
			for(int j=1;j<=13-i;j++)
			{
				System.out.print(" ");
	
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i<=9)
				{
					System.out.print(i);
				}
				else{
					char a=(char)(i+55);
					System.out.print(a);
					
				}
					
			}
			System.out.println();
			
	}
		
		  
		  }
		
			

}
