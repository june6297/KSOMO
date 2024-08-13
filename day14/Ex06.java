package com.day14;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		java.io.File file;
		//상대경로
//		file = new File("./ex01.txt");
		file = new File("ex01.txt");
		System.out.println(file.exists());
		System.out.println("디렉터리"+file.isDirectory());
		System.out.println("파일"+file.isFile());
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(new java.util.Date(file.lastModified()));
	}
}
