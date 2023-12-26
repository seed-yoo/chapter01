package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		// 안내문구
		System.out.println("이름을 입력해주세요.");
		// 이름 :
		System.out.print("이름 : ");
		// 이름 입력받기
		String name = sc.nextLine();
		
		// 안내문구
		System.out.println("나이 입력해주세요.");
		// 나이 :
		System.out.print("나이 : ");
		// 나이 입력받기
		int age = sc.nextInt();
		
		// 안내문구
		System.out.println("키를 입력해주세요.");
		// 키 :
		System.out.print("키 : ");
		// 키 입력받기
		double height = sc.nextDouble();
		
		// 출력
		System.out.println("당신의 이름은 " + name + ", " + "나이는 " + age + "살, " + "키는 " + height + "cm 입니다.");
		
		// 스캐너 종류
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
