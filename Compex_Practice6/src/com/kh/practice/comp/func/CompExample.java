package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("정수 : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("양수 입력");
		}
		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				System.out.println("수");
			} else {
				System.out.println("박");

			}
		}
		
	}

	public void practice2() {
		System.out.println("정수 : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("양수 입력");
			practice2();
		}
		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				System.out.println("수");
			} else {
				System.out.println("박");
			}
		}
	}
	public void practice3() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ltr = sc.nextLine().charAt(0);
		int count = 0;
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==ltr) {
				count++;
			}
		}
		System.out.println(str + "안에 포함된 "+ltr+"개수 : "+ count);
		
		
		
	}
	public void practice4() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ltr = sc.nextLine().charAt(0);
		int count = 0;
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==ltr) {
				count++;
			}
		}
		System.out.println(str + "안에 포함된 "+ltr+"개수 : "+ count);
		while(true) {
			System.out.print("더 하시겠습니까? (y/n)");
			char answ = sc.nextLine().charAt(0);
			if(answ=='y') {
				practice4();
			} else if (answ == 'n') {
				System.exit(0);
			} else {
				System.out.println("잘못된 대답입니다 다시 입력해주세요");
				continue;
				
			}
		}
	}
	
	
	
	
	
	
	
	
}
