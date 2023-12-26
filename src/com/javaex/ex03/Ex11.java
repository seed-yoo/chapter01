package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int m = sc.nextInt();
		
		switch (m) {
		case 1:
			System.out.println("31일 입니다");
			break;

		default:
			break;
		}
		
		
		
		
		
		
		sc.close();
	}

}
