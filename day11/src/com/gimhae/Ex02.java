package com.gimhae;

interface Pen{
	
	void drow();
}

class Ballpen implements Pen{
	String bold="����";
	public void drow() {
		System.out.println(bold+" ���� �߽��ϴ�");
	}
}
class Pencil implements Pen{
	String bold="�����";
	public void drow() {
		System.out.println(bold+" ���� �߽��ϴ�");
	}
}
class Ball{
	public void play() {
		System.out.println("�������Ѵ�");
	}
}

class Box<T>{
	T pen;
	public void setPen(T pen) {
		this.pen=pen;
	}
	public T getPen() {
		return this.pen;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Pencil pen1=new Pencil();
		Ballpen pen3=new Ballpen();
		
		Box<Ballpen> box=new Box<Ballpen>();
		Box<Pencil> box2=new Box<Pencil>();
		box2.setPen(pen1);
		//~~~~
//		Ballpen pen4=box.getPen();
//		pen4.drow();
		Pencil pen5=box2.getPen();
		pen5.drow();
		Box<Ball> box3=new Box<Ball>();
		box3.setPen(new Ball());
		Ball ball=box3.getPen();
		ball.play();
		Box<String> box4=new Box<String>();
		box4.setPen("hello");
		String msg=box4.getPen();
		System.out.println(msg);
	}
}








