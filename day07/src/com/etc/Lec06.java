package com.etc;

public class Lec06 {
	public Lec06() {}
	protected Lec06(String msg) {}
	Lec06(int a){}
	private Lec06(double a) {}
	
	public void func01() {
		System.out.println("lec06 f1 public");
	}
	protected void func02() {
		System.out.println("lec06 f2 protected");
	}
	void func03() {
		System.out.println("lec06 f3 default");
	}
	// �ش� Ŭ���� ���ο����� ���� ���
	private void func04() {
		System.out.println("lec06 f4 private");
	}
}
