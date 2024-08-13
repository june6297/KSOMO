package com.day14;

import java.io.File;
import java.io.IOException;

public class Ex08 {
	public static void main(String[]args) throws IOException {
		File f = new File("ex01.txt");
		
		if(f.exists()) {
			System.out.println("있음요");
		}else {
			boolean result = f.createNewFile();
			System.out.println("만듦요"+result);
		}
	}
}
