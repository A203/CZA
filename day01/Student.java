package com.geiminuo;

import java.util.Scanner;

public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    int process=scanner.nextInt();
    String processString="";
    switch(process)
    {
    case 1:processString="增加1个学生" ;break;
    case 2:processString="显示所有学生";break;
    case 3:processString="退出程序";break;
    default: processString="错误程序";
    }
    System.out.println(processString);
	}

}
