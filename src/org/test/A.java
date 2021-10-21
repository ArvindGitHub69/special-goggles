package org.test;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String next = sc.next();
		System.out.println("Email adress is "+next);
		boolean b = next.contains("@");
		System.out.println(b);
		
	
				
}}
