package com.geminno.two;

public class zhishu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;boolean flag=true;
		for(int i=2;i<=100;i++){
			flag=true;
		         for(int j=2;j<=i-1;j++)
		      {
			    if(i%j==0){
				   flag=false;
			              break;
			            }
		       }
	
		if(flag){
	
			num++;
		    }
		}
		System.out.println(num);
			
	}
	}


