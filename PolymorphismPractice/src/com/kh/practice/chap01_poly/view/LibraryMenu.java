package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.println("===메뉴===");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.println("메뉴 번호 : ");
		int menuNum = sc.nextInt(); sc.nextLine();
		boolean run = true;
		while(run) {			
			switch(menuNum) {
			case 1 : 
				run = false;
				break;
			case 2 : selectAll();
			run = false;
			break;
			case 3 : searchBook();
			run = false;
			break;
			case 4 : rentBook();
			run = false;
			break;
			case 9 : System.exit(0);
			run = false;
			break;
			default : System.out.println("다시입력");
			mainMenu();
			break;
			}
		}
	}
	public void selectAll() {
		LibraryController lc = new LibraryController();
		lc.selectAll();
	}
	public void searchBook() {}
		LibraryController lc1 = new LibraryController();
		
	public void rentBook() {}
	
}
