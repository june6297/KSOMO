package com.day14;

//class IdException extends Exception{
//	public IdException() {
//		super("중복아이디");
//	}
//}

public class Ex05 {
	public static void main(String[] args) {
		try {
			func01();
		}catch(Exception e) {
			System.out.println("중복아이디");
		}
	}
	
	public static void func01() throws Exception {
		throw new Exception();
	}
}
