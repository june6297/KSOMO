package com.day12;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

public class Ex07 extends java.awt.Frame{
	// 배치 - 배치관리자
	// 요소 - ui컴포넌트 종류 사용법
	
	public Ex07() {
		// 배치관리자 - 상대속성, 절대속성
		// FlowLayout 가운데 정렬, 컴포넌트의 배치, 크기x
		// 컨텐츠 크기에 맞춰 사이즈
		
		
		// GridLayout
				
		Font f = new Font("Algerian",1,20);
		LayoutManager lm = new GridLayout(2,2);
		this.setLayout(lm);
		java.awt.Button btn = new Button();
		btn.setFont(f);
		btn.setLabel("one");
		java.awt.Button btn2 = new Button();
		btn2.setLabel("two");
		java.awt.Button btn3 = new Button();
		btn3.setLabel("three");
		java.awt.Button btn4 = new Button();
		btn4.setLabel("four");
		java.awt.Button btn5 = new Button();
		btn5.setLabel("five");
		java.awt.Button btn6 = new Button();
		btn6.setLabel("six");
		this.add(btn);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.setSize(500,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// GUI
		// awt		1.0~	os요청		빠르고 자원소모 운영체제종속
		// swing	1.2~	java drow	awt가 못하는 것
		
		Ex07 me = new Ex07();
		
	}
	
}
