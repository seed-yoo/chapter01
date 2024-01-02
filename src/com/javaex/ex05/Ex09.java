package com.javaex.ex05;

public class Ex09 {

	// String args = new String[3];
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "번째 값: " + args[i]);
		}
		
		// -h일때
		if(args[0].equals("-h")) {
			System.out.println("[-h]:도움말");
			System.out.println("[-v]:버전정보");
			System.out.println("[-m]:만든사람");
		}else if(args[0].equals("-v")) {
			System.out.println("버전: 1.1");
		}else if(args[0].equals("-m")) {
			System.out.println("만든사람: YooYoungSu");
		}else {
			System.out.println("옵션을 확인하세요.");
		}
		
	}
	
	/*
	 수동으로 실행시킬때(cmd로 실행 시킬때)
	 
	패키지 직전
	
	.../bin	이동
	
	java com.javaex.ex05.Ex09 i am yoo young su
	
	java com.javaex.ex05.Ex09 -h
	[-h]:도움말
	[-v]:버전정보
	[-m]:만든사람
	
	java com.javaex.ex05.Ex09 -v
	버전 1.1
	
	java com.javaex.ex05.Ex09 -m
	만든사람: yooyoungsu
	

	 */
	
	
}
