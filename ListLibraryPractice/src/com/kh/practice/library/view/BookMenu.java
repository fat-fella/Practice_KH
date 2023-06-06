package com.kh.practice.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.library.controller.BookController;
import com.kh.practice.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		System.out.println("==Welcome to KH Library==");
		System.out.println("********메인메뉴********");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		int mainNum = sc.nextInt();
		if (mainNum == 1) {
			insertBook();
		} else if (mainNum == 2) {
			selectList();
		} else if (mainNum == 3) {
			searchBook();
		} else if (mainNum == 4) {
			deleteBook();
		} else if (mainNum == 5) {
			ascBook();
		} else if (mainNum == 9) {
			System.exit(0);
		} else {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			mainMenu();
		}

	}

	public void insertBook() {
		System.out.println("=====새 도서 추가=====");
		System.out.println("책 정보를 입력해주세요");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		String category = null;
		while (true) {
			System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
			int catNum = sc.nextInt();
			if (catNum == 1) {
				category = "인문";
				break;
			} else if (catNum == 2) {
				category = "과학";
				break;
			} else if (catNum == 3) {
				category = "외국어";
				break;
			} else if (catNum == 4) {
				category = "기타";
				break;
			} else {
				System.out.println("다시 입력");

			}
		}
		System.out.print("가격 : ");
		int price = sc.nextInt();

		Book b = new Book(title, author, category, price);
		bc.insertBook(b);
	}

	public void selectList() {
		ArrayList<Book> list = bc.selectList();
		if (list == null) {
			System.out.println("책 없음");
		} else {
			System.out.println("전체 도서 조회");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}

	}

	public void searchBook() {
		System.out.println("==도서검색==");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if (searchList == null) {
			System.out.println("검색결과없음");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}

	public void deleteBook() {
		System.out.println("삭제할 도서 명 : ");
		String title = sc.next();
		System.out.println("삭제할 저자 명 : ");
		String author = sc.next();
		Book remove = bc.deleteBook(title, author);
		if(remove==null) {
			System.out.println("삭제할 도서 찾지 못함");
		} else {
			System.out.println("삭제 성공~!");
		}
	}

	public void ascBook() {
		if(bc.ascBook()==1) {
			System.out.println("정렬 성공~!");
		} else {
			System.out.println("정렬 실패ㅠ");
		}
		
	}

}
