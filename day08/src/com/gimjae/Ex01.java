package com.gimjae;

/*
 * �߻�Ŭ����
 * �߻�޼��带 0���̻� ���� Ŭ������ �ǹ�
 * ȥ�ڼ� ��ü�� ������ �Ұ��� �մϴ�
 * ����� ���� ���
 * 
 * 
 * 
 * */

abstract class Parent{
	
	void func01() {
		System.out.println("�θ��� ���");
	}
	
//	 �߻�޼��� - �޼����� ����, ������ ����
	public abstract void func02();
}

class Child extends Parent{
	@Override
	public void func02() {
		System.out.println("�ڽ��� �������̵��� ���");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.func01();
		c1.func02();
		
		Parent p=new Child();
		p.func01();
		p.func02();
	}

}











