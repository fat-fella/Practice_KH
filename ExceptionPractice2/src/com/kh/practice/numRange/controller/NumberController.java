package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	public NumberController() {}
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		if(num1>=num2) {
			System.out.println(num1 +"은 "+ num2 + "의 배수인가?");
			if(num1%num2==0) {
				System.out.println("true");
				return true;
			}
		}else if (num1<num2) {
			System.out.println(num2 + "은 " + num2 +" 의 배수인가?");
			if(num2%num1==0) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}

}
