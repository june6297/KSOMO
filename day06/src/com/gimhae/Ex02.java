package com.gimhae;

public class Ex02 {

	public static void main(String[] args) {
		func01();
	}
	// �ݺ���,switch���� Ż��(�ֱ��� �ݺ���)
	public static void func01() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i>5)break;
			System.out.println("func01-"+i);
		}
		System.out.println("f1�� ������");
	}
	// �ش� �޼����� ����
	public static void func02() {
		for(int i=0; i<10; i++) {
			if(i>5)return;
			System.out.println("func02-"+i);
		}
		System.out.println("f2�� ������");
	}
	// �ݺ����� ������� ���ư�
	public static void func03() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i>5)continue;
			System.out.println("func03-"+i);
		}
		System.out.println("f3�� ������");
	}

}
