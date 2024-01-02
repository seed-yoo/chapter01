package com.javaex.ex05;

import java.util.Scanner;

public class Ex08_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int[] arrleftArray = { 10, 20, 30 };
//		int[] arrrigjtArray = { 10, 20, 30};
		
		
		int[] arrleftArray = new int[3];
		int[] arrrightArray  = new int[3];
		
		for (int i = 0; i < arrleftArray.length; i++) {
			arrleftArray[i] = sc.nextInt();
		}
		
		System.out.println("===========================");
		
		for (int i = 0; i < arrrightArray.length; i++) {
			arrrightArray[i] = sc.nextInt();
		}
		
		System.out.println("===========================");
		
		for (int i = 0; i < arrleftArray.length; i++) {
			System.out.println("arrleftArray[" + i + "]" + "=" + arrleftArray[i]);
		}
		
		System.out.println("===========================");
		
		for (int i = 0; i < arrrightArray.length; i++) {
			System.out.println("arrrightArray[" + i + "]" + "=" + arrrightArray[i]);
		}
		
		
		for (int i = 0; i < arrrightArray.length; i++) {
			if(arrleftArray[i] != arrrightArray[i]) {
				System.out.println((i+1) + "번째 값이 다릅니다.");
			}
		}
		
		
		sc.close();
		
	}

}
