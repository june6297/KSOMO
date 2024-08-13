package com.day14;

import java.io.*;

public class Ex14 {
	public static void main(String[] args) throws IOException{
		File src = new File("1.png");
		File copy = new File("copy1.png");
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(copy);
		
		long before = System.currentTimeMillis();
		
		while(true) {
			int su = is.read();
			if(su==-1)break;
			os.write(su);
		}
		long after = System.currentTimeMillis();
		System.out.println(after-before+"ms");
		System.out.println("복사완료");
		copy.createNewFile();
		
		os.close();
		is.close();
	}
}
