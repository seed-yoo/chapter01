package com.javaex.ex03;

import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int t = sc.nextInt();
		
		int m = 10000;
		int r = t*m;
		int r2 = 80000 + (t-8)*(m*3/2);
		
		if (t<=8 && t>0) {
			System.out.println("임금은 " + r + "원 입니다.");
		} else if(t>8) {
			System.out.println("임금은 " + r2 + "원 입니다.");
		} else {
			System.out.println("정수입력이 아닙니다.");
		}
		
		
		
		sc.close();
	}

}
