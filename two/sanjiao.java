package com.geminno.two;

import java.util.Scanner;

public class sanjiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("ÇëÊäÈëĞĞÊı£º");
		int num= input.nextInt();
//		for(int i=1;i<=num;i++){
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

        		
				

	}

}
