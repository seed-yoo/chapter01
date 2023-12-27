package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int t = sc.nextInt();
		
		int m = 10000;
		int m2 = 12000;
		int result = t * m;
		int result2 = 8*m + ((t-8)*m2);
		
		if (t <= 8 && t > 0) {
			System.out.println("임금은 " + result +"원 입니다." );
		} else if (t > 8) {
			System.out.println("임금은 " + result2 +"원 입니다." );
		}else {
			System.out.println("입력값이 정수가 아닙니다. => 종료");
		}
		
		sc.close();
		
	}

}
