package com.day12;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class Ex12 extends Frame{
	
	public Ex12() {
		setLayout(new FlowLayout());
		
		TextField tf = new TextField(15);
		
		add(tf);
		
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex12();
	}
}
