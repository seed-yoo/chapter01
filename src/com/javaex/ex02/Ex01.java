package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		int i = 12345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String str = "안녕하세요";
		String name = "유영수";
		String hello = "굿모닝";
		
		System.out.println(i);
		System.out.println(12345);
		
		System.out.println(str);
		System.out.println("안녕하세요");
		
		System.out.print(name);
		System.out.println(str);
		
		System.out.println("=================================");
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("=================================");
		System.out.println(hello + hello);
		System.out.println(name + hello + hello);
		System.out.println(name + " " + hello + " " + hello);
		System.out.println(name + "님 " + hello + " " + hello);
		System.out.println("제 이름은 " + name + " 입니다.");
		System.out.println("=================================");
		
		System.out.println(i + i);
		System.out.println(d + d);
		System.out.println(i + d);
		
		System.out.println(c + c);	// 숫자로 연산된다.
		System.out.println(s + s);
		
		System.out.println(name + i + d);
		
		System.out.println("=================================");
		System.out.println("안녕\"하세\"요");
		System.out.println("안녕\\하세\\요");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		
		
		
		
		
		
		
		
		
	}

}
