package com.gimhae;

public class Ex06 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int age=0;
		char gender='��';
		System.out.println("�ֹι�ȣ üũ(ver 0.1.0)");
		String input="";
		char[] arr1;
		System.out.print("�ֹι�ȣ> ");
		input=sc.nextLine();
		arr1=input.toCharArray();
		
		age=2024-(1900+toNumber(arr1[0],arr1[1])-1);
		if(toNumber(arr1[7])>2)age-=100;
		if(toNumber(arr1[7])%2==0)gender='��';
		System.out.println("����� "+age+"�� "+gender+"���Դϴ�.");
	}

	public static int toNumber(char ch1,char ch2) {
		return (ch1-'0')*10+(ch2-'0');
	}
	public static int toNumber(char ch) {
		return ch-'0';
	}
	public static boolean isNumber(char ch) {
		if(ch<'0'|| ch>'9') return false;
		return true;
	}

}
