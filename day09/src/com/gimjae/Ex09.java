package com.gimjae;

public class Ex09 {

	public static void main(String[] args) {
		// ���ڿ�
		String msg1="java";
		String msg2=new String("java");
		// �����忡 ������
		StringBuilder msg3;
		StringBuffer msg4;

		msg3=new StringBuilder("ja");
		String msg5=msg1+"script";
		String msg8=msg1+"17";
		StringBuilder msg6=msg3.append("va");
		StringBuilder msg7=msg3.append("2");
		System.out.println(msg3);
		System.out.println(msg6);
		System.out.println(msg7);
	}

}
