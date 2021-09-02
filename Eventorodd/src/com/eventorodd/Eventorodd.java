package com.eventorodd;

import java.util.Scanner;

public class Eventorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number");
		  //The input provided by user is stored in num
		Scanner scan = new Scanner(System.in);			
			int num =scan.nextInt();
			//If number is divisible by 2 then it's an even number
		    // else odd number*/
			if(num % 2 == 0)
			{
				System.out.println("Number is Event:"+num);
			}
			else
			{
				System.out.println("Number is odd:"+num);
			}
	}
}
