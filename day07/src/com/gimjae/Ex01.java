package com.gimjae;


// ���
// �θ��� ����� �����޴� ��
// ���� ���(���߻���� �������� ����)
// class Ŭ������ extends �θ�Ŭ����{}
// ��� Ŭ������ ������� �̷����
// extends �θ� �ڵ���� ������ java.lang.Object
// �θ� -> �ڽ����� ���
class Parent extends Object{
	public int money=1000;
	public void how() {
		System.out.println(this.money+"�� ����");
	}
}

class Child extends Parent{
	public int money=100;
	public void func02() {
		System.out.println("�ڽĸ��� ���...");
	}
	// �����ε�(������,�޼���) �������̵��� ���̴� �����ΰ�?
	// �����ε�-�̸����ߺ�,��Ģ���Ұ�,�Ϻ����,�Ķ����,����,����,Ÿ��,����
	// �޼��� �������̵�(���� �޼��常..)
	// ��ӿ��� �θ�κ��� �������� ����� ������ �ؼ� ���
	@Override// ������̼�
	public void how() {
		System.out.println("������");
	}
}


public class Ex01 extends Object {

	public static void main(String[] args) {
		Child me2=new Child();
		me2.how();
		me2.func02();
		
		Ex01 me=new Ex01();
		System.out.println(me);
		System.out.println(me.toString());
	}
	
	@Override
	public String toString() {
		return "���� ������";
	}

}










