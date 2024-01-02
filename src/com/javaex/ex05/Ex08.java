package com.javaex.ex05;

public class Ex08 {
	
	public static void main(String[] args) {
		
		int[] leftArray = { 10, 20, 30 };
		int[] rightArray = { 10, 30, 20 };
		
		// 방의 갯수 비교
		if(leftArray.length == rightArray.length) {
			// 방의 갯수가 같으면
			// 세부검사
			for (int i = 0; i < leftArray.length; i++) {
				// 같은방의 값이 다르면
				if(leftArray[i] != rightArray[i]) {
					System.out.println("[" + i + "]" + "값이 다릅니다.");
				}
			}
			
		}else {
			// 방의 갯수가 다르면
			System.out.println("두배열의 크기가 다릅니다");
		}
	}

}
