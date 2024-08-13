package com.day14;

import java.io.*;

public class Ex18 {
	public static void main(String[] args)throws IOException{
		File f = new File("test.txt");
		try {
			Reader r= new FileReader(f);
			while(true) {
				int a = r.read();
				if(a==-1)break;
				System.out.print((char)a);
			}
			r.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
	}
}
