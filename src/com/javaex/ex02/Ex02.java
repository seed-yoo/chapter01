package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		// 안내출력
		System.out.println("이름을 입력해주세요.");
		// 이름출력
		System.out.print("이름 : ");
		// 이름 입력받기
		String name = sc.nextLine();
		
		
		// 안내출력
		System.out.println("나이를 입력해주세요.");
		// 나이출력
		System.out.print("나이 : ");
		// 나이 입력받기
		int age = sc.nextInt();
		
		
		// 안내출력
		System.out.println("키를 입력해주세요.");
		// 키출력
		System.out.print("키 : ");
		// 키 입력받기
		double height = sc.nextDouble();
		
		
		// 결과출력
		System.out.println("당신의 이름은 " + name + ", " + "나이는 " + age + "살, " + "키는 " + height + "cm 입니다.");
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
