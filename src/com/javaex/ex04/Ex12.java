package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {

		int i =1;
		boolean flag=true;
		
		while (flag) {
			
			if(i>3) {
				flag=false;
			}
			
			System.out.println(i);
			i++;
		}
	}

}
