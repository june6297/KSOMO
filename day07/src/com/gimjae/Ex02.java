package com.gimjae;

class Lec02 extends Object{
	int su=1111;
	public void func01() {
		System.out.println("�θ��� ���");
	}
}

public class Ex02 extends Lec02 {
	int su=2222;

	public void func01() {
		super.func01();
		System.out.println("�ڽ��� ���");
		System.out.println(super.su);
		System.out.println(this.su);
	}
	
	public static void main(String[] args) {
		Ex02 me=new Ex02();
		me.func01();
		System.out.println(me.toString());
	}

}
