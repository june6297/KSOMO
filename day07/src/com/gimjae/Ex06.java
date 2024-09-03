package com.gimjae;

// ����������
// public > protected >= default > private
// �ʵ�,�޼���,������
// Ŭ�������� ����������
// �ѹ������� public class�� ���� �ϳ��� ����
// �׸��� ���θ޼��带 ���� Ŭ������ public
// ���� public�� default�� ����

class Lec06{
	
	// ��� ���� ���
	public void func01() {
		System.out.println("f1 public");
	}
	// ������Ű���������� ������ ����ϳ�
	// ����� ���ؼ��� ��� ���� ���
	protected void func02() {
		System.out.println("f2 protected");
	}
	// ������Ű���������� ������ ���
	void func03() {
		System.out.println("f3 default");
	}
	// �ش� Ŭ���� ���ο����� ���� ���
	private void func04() {
		System.out.println("f4 private");
	}
}

public class Ex06 extends com.etc.Lec06{

	public static void main(String[] args) {
		com.gimjae.Lec06 lec=new com.gimjae.Lec06();
		lec.func01();
		lec.func02();
		lec.func03();
//		lec.func04();
		Ex06 me=new Ex06();
		me.func01();
		me.func02();
//		me.func03();
//		me.func04();
	}

}
