package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int m = sc.nextInt();
		
		if(m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.println("30일 입니다.");
		}else if (m == 2) {
			System.out.println("28일 입니다.");
		}else {
			System.out.println("31일 입니다.");
		}
		
		
		
		sc.close();
	}

}
