package com.kh.practice.list.music.view;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		int menu =-1;
		do {
			System.out.println("**메인메뉴**");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println("0. 파일에 저장");
			System.out.print("메뉴번호 선택 : ");
			String menuNum = sc.nextLine();
			menu = -1;
			try {
				menu = Integer.parseInt(menuNum);
			} catch (NumberFormatException e) {
				System.out.println("숫자로 다시입력");
			}
			switch (menu) {
			case 0: saveFile(); break;
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 7: ascTitle(); break;
			case 8: descSinger(); break;
			case 9: System.out.println("종료");
				break;
			default : System.out.println("다시 입력");
				continue;
			}
		} while (menu != 9);
		
		return; // 생략가능
	}
		
		
		
		
		
		
	public void addList() {
		System.out.println("===마지막 위치에 곡 추가===");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		int  result = mc.addList(new Music(title, singer));
		if(result>0) {
			System.out.println("추가성공");
		} else {
			System.out.println("추가실패");
		}
		
		
		
		
		
		//TODO
		
	}
	public void addAtZero() {
		System.out.println("===첫 위치에 곡 추가===");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		int  result = mc.addAtZero(new Music(title, singer));
		if(result>0) {
			System.out.println("추가성공");
		} else {
			System.out.println("추가실패");
		}
		//TODO
		
	}
	public void printAll() {
		System.out.println("==전체 곡 목록 출력==");
		List<Music> volist = mc.printAll();
		for(Music vo : volist) {
			System.out.println(vo);
		}
		//TODO
	}
	public void searchMusic() {
		System.out.println("==특정 곡 검색==");
		System.out.print("검색할 곡명 : ");
		String title = sc.nextLine();
		Music result = mc.searchMusic(title);
		if(result == null) {
			System.out.println("검색 결과 없음");
		} else {
			System.out.printf("검색한 곡은 (%s, %s) 입니다.\n", result.getTitle(), result.getSinger());
		}
		System.out.println("결과");
		
		
		//TODO
		
	}
	public void removeMusic() {
		System.out.println("==특정 곡 삭제==");
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		Music result = mc.removeMusic(title);
		if(result == null) {
			System.out.println("검색 결과 없음");
		} else {
			System.out.printf("검색한 곡은 (%s, %s) 입니다.\n", result.getTitle(), result.getSinger());
		
		System.out.printf("%s - %s 을(를) 삭제했습니다.", result.getTitle(), result.getSinger());
		}
		//TODO
		
	}
	public void setMusic() {
		System.out.println("==특정 곡 정보 수정==");

		System.out.print("곡 명 :");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		mc.setMusic(title, null);
		//TODO
		int result = 0;
	}
	public void ascTitle() {
		System.out.println("===곡 명 오름차순 정렬===");
		int result = mc.ascTitle();
		if(result>0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
	public void descSinger() {
		System.out.println("===가수명 내림차순 정렬===");
		int result = mc.descSinger();
		if(result>0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
	public void saveFile() {
		System.out.println("==파일저장==");
		System.out.println("저장할 파일 경로를 작성해주세요");
		String fileName = sc.nextLine();
		
		int result = mc.saveFile(fileName);
		if(result >0) {
			System.out.println("저장성공");
		} else {
			System.out.println("저장실패");
		} 
			
		
		
		
	}
	
	
	
	
	
	
	
	
}

