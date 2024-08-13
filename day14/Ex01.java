package com.day14;

public class Ex01 {
	public static void main(String[] args) {
		//예외처리
		//예외 - 에러가 발생할 수 있는 상황 회피
		//try{예외가 발생할 수 있는 구문} catch(잡아낼 수 있는 클래스 변수){처리}
		int a = 4;
		int b = 1;
		int c = 0;
		try {
			c=a/b;
		}catch(ArithmeticException e) {
			c=0;
		}
		System.out.println(a+"%"+b+"="+c);
	}
}
