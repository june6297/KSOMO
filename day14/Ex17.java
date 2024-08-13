package com.day14;

import java.io.*;

public class Ex17 {
	public static void main(String[] args) throws IOException{
		File f = new File("test02.txt");
		//문자열 스트림 2byte
		Writer w = new FileWriter(f);
		w.write('한');
		w.write('글');
		w.write('도');
		w.write('도');
		w.write('독');
		System.out.println("끝남");
		w.close();
	}
}
