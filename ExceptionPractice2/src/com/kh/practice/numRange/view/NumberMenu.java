package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);
	NumberController nc = new NumberController();
	public void menu() {
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		try {
			if (num1 > 100||num1<1|| num2>100|| num2<1) {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
			} else {
				nc.checkDouble(num1, num2);
			}
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
		}
}
