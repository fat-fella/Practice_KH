package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

	public class UpandDown {
		public void upDown() {
		Scanner sc = new Scanner(System.in);
		Random rRandom = new Random();
		int rResult = rRandom.nextInt(100)+1;
		int cnt = 0;
		while(true) {
			System.out.println("guess between 1~100");
			int guessNum = sc.nextInt();
			if(guessNum > 100 || guessNum < 1) {
				System.out.println("input 1~100");
				continue;
			} else if (guessNum>rResult) {
				System.out.println("down");
				cnt++;
				continue;
			} else if (guessNum<rResult) {
				System.out.println("up");
				cnt++;
			} else if(guessNum==rResult) {
				System.out.println("ugotit");
				System.out.println(cnt+"tries");
				break;
			}
		}
	
	}
}