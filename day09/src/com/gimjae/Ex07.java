package com.gimjae;

public class Ex07 {
	public static void main(String[] args) {
		char ch1=65;
		Character ch2=new Character(ch1);
		Character ch3=new Character((char)97);
		Character ch4=new Character('a');
		
		char ch5='%';
		System.out.println("�ڹٿ�����밡�ɹ��ڳ�"+Character.isDefined(ch5));
		System.out.println("���ڳ�"+Character.isLetter(ch5));
		System.out.println("���ڳ�"+Character.isJavaLetter(ch5));
		System.out.println("���ڳ�"+Character.isAlphabetic(ch5));
		System.out.println("���ڳ�"+Character.isDigit(ch5));
		System.out.println("�����̳�"+Character.isSpace(ch5));
		System.out.println("�����̳�"+Character.isWhitespace(ch5));
		System.out.print("���н�\n");
		System.out.print("������\r\n");
		System.out.println(ch3);
	}
}
