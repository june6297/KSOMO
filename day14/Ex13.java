package com.day14;

import java.io.*;

public class Ex13 {
	public static void main(String[] args) throws IOException {
		File f = new File("target01.txt");
		InputStream is = new FileInputStream(f);
//		System.out.println(is.read());
//		System.out.println(is.read());
//		System.out.println(is.read());
		while(true) {
			int su = is.read();
			if(su==-1)break;
			System.out.print((char)su);
		}
	}
}
