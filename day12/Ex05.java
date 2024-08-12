package com.day12;

// 익명클래스 anonymous class

class Anony{
	void func() {}
}
public class Ex05 {
	
	public static void func01() {
		
		Anony obj = new Anony(){
			void func() {
				System.out.println("실행");
			}
		};
		obj.func();
	}
	
	public static void main(String[] args) {
		func01();
	}
}
