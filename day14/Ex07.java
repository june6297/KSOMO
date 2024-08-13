package com.day14;

import java.io.File;

public class Ex07 {
	//파일 지우기
	public static void main(String[] args) {
		File f = new File("ex01.txt");
		if(f.exists()) {
			boolean result = f.delete();
			System.out.println("지움요");
		}else {
			System.out.println("없음요");
		}
	}
}
