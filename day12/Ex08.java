package com.day12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Panel;

public class Ex08 {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		LayoutManager lm;
		lm = new BorderLayout();
		f.setLayout(lm);
		
		Panel center = new Panel();
		Button btn1 = new Button();
		btn1.setLabel("top");
		center.add(btn1);
		f.add(center,"Center");

		Button btn2 = new Button();
		btn2.setLabel("center");
		center.add(btn2);
		f.add(center,"Center");
		
		Button btn3 = new Button();
		btn3.setLabel("left");
		center.add(btn3);
		f.add(center,"West");
		
//		Button btn4 = new Button();
//		btn4.setLabel("right");
//		f.add(btn4,"East");
		
//		Button btn5 = new Button();
//		btn5.setLabel("down");
//		f.add(btn5,"South");
//		
		f.setSize(500,400);
		f.setVisible(true);
		
	}
}
