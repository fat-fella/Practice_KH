package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public Scanner sc = new Scanner(System.in);
	CharacterController cc = new CharacterController();
	public void menu() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		try {
			if(str.contains(" ")) {
				throw new CharCheckException("공백 빼라");
			} else {
				System.out.println(str+"에 포함된 영문자 개수 : " + cc.countAlpha(str));
			}
		} catch(CharCheckException e) {
			e.printStackTrace();
		}
		
	}
}
