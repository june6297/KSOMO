package com.gimjae;

class Ball{
	final int num;
	private boolean chck;
	String color;
	
	public Ball(int num) {
		this.num=num;
		chck=false;
		if(num<=10) color="�����";
		else if(num<=20) color="�Ķ���";
		else if(num<=30) color="������";
		else if(num<=40) color="������";
		else color="�ʷϻ�";
	}
	public void check() {
		chck=true;
	}
	public boolean isCheck() {
		return this.chck;
	}
	
}

public class Ex14 {
	public static void main(String[] args) {
		System.out.println("�ζ� ��ȣ ������ (ver 1.2.0)");
		Ball[] box=new Ball[45];
		for(int i=0; i<box.length; i++) {
			box[i]=new Ball(i+1);
		}
		for(int i=0; i<6; i++) {
			int su=(int)(Math.random()*45);
			Ball ball=box[su];
			if(ball.isCheck()) {
				i--;
			}else {
				ball.check();
				System.out.println(ball.color+" �� "+ball.num+"��");
			}
		}
	}
}











