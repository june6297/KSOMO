package com.day14;

import java.io.File;

public class Ex09 {
	public static void main(String[] args) {
		File f = new File("test01");
		
		boolean result = f.mkdir();
		if(result) System.out.println("만듦요");
		else System.out.println("있음요");
	}
}
