package com.gimhae;

public class Ex10 {

	public static void main(String[] args) {
		// ���ڿ�
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		String msg6=sc.nextLine();
		String msg1="abcd";
		String msg2=new String("abcd");
		String msg3=new String(new char[] {'a','b','c','d'});
		String msg4=new String(new byte[] {97,98,99,100});
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		String msg5="abcd";
		// ���ڿ� = ��������
		System.out.println(msg1==msg5);
		System.out.println(msg1==msg2);
		System.out.println(msg1==msg6);
	}

}
