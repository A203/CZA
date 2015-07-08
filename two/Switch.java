package com.geminno.two;

import java.util.Scanner;

public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    String dayString=scanner.nextLine();
    int day=0;
    switch(dayString.toLowerCase())
    {
    case "monday":day=1;
    case "tuesday":day=2;
    case "wednesday":day=3;
    case "thursday":day=4;
    case "friday":day=5;
    case "saturday":day=6;
    case "sunday":day=7;
    
    default :day=0;
    
	}
System.out.println(day);
	}
}
