package com.javaex.ex01;

public class Ex13 {

	public static void main(String[] args) {
		// 논리 연산자
		// && and 연산자
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("========================================");
		
		// || or 연산자
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("========================================");
		
		// 응용
		int a = 5;
		int b = 7;
		
		System.out.println("&& and 연산자 예제 : ");
		System.out.println( (a>b) && (a<b) );	// false && true => false
		System.out.println( (a>b) && (a>b) );	// false && false => false
		
		System.out.println("|| or 연산자 예제 : ");
		System.out.println( (a>b) || (a<b) );	// false && true => true
		
		System.out.println("&& and 연산자 및 || or 연산자 예제 : ");
		System.out.println( (a>b) && (a<b) || (a<b) );	// false && true || true => true
		
		System.out.println("|| or 연산자 예제 : ");
		System.out.println( (a<b) || (a>b) || (a>b) );	// true || false || false => true
		
		System.out.println("========================================");
		
		// ! NOT 연산자
		System.out.println( !(a<b) );
		System.out.println( !(a>b) );
		
		System.out.println( !((a>b) || (a<b)) );
		
		
		
		
		
		
	}

}
