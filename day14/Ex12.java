package com.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {
	public static void main(String[] args) {
		File f = new File("target01.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/////////////////////////////
		String msg = "hello java";
		
		java.io.OutputStream os = null;
		try {
			os = new FileOutputStream(f);
			os.write(65);
			os.write(97);
			for(int i=0;i<msg.length();i++) {
				os.write(msg.charAt(i));
			}
			System.out.println("작성완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
