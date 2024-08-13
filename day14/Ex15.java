package com.day14;

import java.io.*;

public class Ex15 {
	public static void main(String[] args) throws IOException{
		String msg = "입력 완료";
		byte[] arr1 = msg.getBytes();
		File f = new File("target01.txt");
		
		OutputStream os = new FileOutputStream(f);
		for(int i=0;i<msg.length();i++) {
			os.write(arr1[i]);
		}
		System.out.println("작성완료");
		os.close();
	}
}
