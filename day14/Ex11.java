package com.day14;

import java.io.*;
import java.util.*;

public class Ex11 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> ");
		File f = new File(br.readLine());
		boolean result = f.exists();
		if(result) {
//			System.out.println("있음요");
			File[] arr = f.listFiles();
			for(int i=0;i<arr.length;i++) {
				System.out.print("rwx   ");
				System.out.print(new Date(arr[i].lastModified())+"   ");
				if(arr[i].isDirectory()) System.out.print("<DIR>   ");
				else System.out.print("        ");
				System.out.println(arr[i].getName());
			}
		}else System.out.println(".");
	}
}
