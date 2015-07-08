package com.geminno.two;

public class maopaopaixu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={8,5,3,4};
		int temp=0;
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
