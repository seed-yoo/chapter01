package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 :");
		int s = sc.nextInt();
		if(90 <= s) {
			System.out.println("A등급");
		}else if (80<= s && 90>s) {
			System.out.println("B등급");
		}else if ( 70<= s && 80>s) {
			System.out.println("C등급");
		}else if ( 60<=s && 70>s) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		
		sc.close();
		
	}

}
