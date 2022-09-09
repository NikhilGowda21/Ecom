package com.prc;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ch ");
		ch = sc.nextInt();
		
		switch (ch) {
		case 3:
			System.out.println("A");
		default:
			System.out.println("invlaid choice");
			break;
		case 1:
			System.out.println("B");
			break;
		case 2:
			System.out.println("C");
		
		}
	}
}
