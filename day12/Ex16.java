package com.day12;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ex16 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(500,400);
		f.setVisible(true);
		
		Choice cho1 = new Choice();
		cho1.addItem("1");
		cho1.addItem("2");
		cho1.addItem("3");
		cho1.addItem("4");
		
		cho1.select("2");
		
		f.add(cho1);
	}
}
