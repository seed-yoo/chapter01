package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		double[] dArray = new double[3];
		dArray[0] = 3.5;
		dArray[1] = 7.2;
		//dArray[2] = 12.8;
		
		// 1개만 사용
		System.out.println(dArray[1]);
		
		System.out.println("============================");
		
		// 모두사용
		for (int i = 0; i < dArray.length; i++) {
			System.out.println(dArray[i]);
		}
		
	}
}
