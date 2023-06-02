package com.kh.hw.shape.view;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	
	public void inputMenu() {
		while(true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3.삼각형");
			System.out.println("4.사각형");
			System.out.println("9.프로그램 종료");
			System.out.print("메뉴 번호: ");
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 3: triangleMenu();
					break;
			case 4 : squareMenu();
					break;
			case 9 : System.out.println("프로그램을 종료");		
					System.exit(0);
					break;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요");	
					inputMenu();
					break;
			}
		}
	}
	public void triangleMenu() {
		while(true) {
			System.out.println("====삼각형===");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호: ");
			int triNum = sc.nextInt();
			switch(triNum) {
			case 1 : inputSize(3, triNum);
				break;
			case 2 : inputSize(3, triNum);
				break;
			case 3 : printInformation(triNum);
				break;
			case 9 : 
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요");
				triangleMenu(); 
				break;
			}
		}
		
		
	}
	public void squareMenu() {
		while (true) {
			System.out.println("====사각형=====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칙");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호: ");
			int squNum = sc.nextInt();
			switch(squNum) {
			case 1 : inputSize(4, squNum); break;
			case 2 : inputSize(4, squNum); break;
			case 3 : inputSize(4, squNum); break;
			case 4 : printInformation(squNum); break;
			case 9 : System.out.println("메인으로 돌아갑니다.");
					 inputMenu(); break;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요");
					  squareMenu(); break;
			}
			
			
			
			
			
			
		}
		
	}
	public void inputSize(int type, int menuNum) {
		
		
	}
	public void printInformation(int type) {
		
	}
	
}
