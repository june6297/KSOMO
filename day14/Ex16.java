package com.day14;

import java.io.*;

public class Ex16 {
	public static void main(String[] args) throws IOException{
		File f =new File("target01.txt");
		byte[]arr = new byte[(int)f.length()];
		InputStream is = new FileInputStream(f);
		int cnt=0;
		while(true) {
			int su = is.read();
			if(su==-1)break;
			arr[cnt++]=(byte)su;
		}
		System.out.println(new String(arr));
		
		is.close();
	}
}
