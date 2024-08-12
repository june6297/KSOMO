package com.day12;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

public class Ex10 extends Frame{
	
	public Ex10() {
		
		LayoutManager lm = new GridBagLayout();
		setLayout(lm);
		
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		Button btn5 = new Button();
		Button btn6 = new Button();

		btn1.setLabel("one");
		btn2.setLabel("two");
		btn3.setLabel("three");
		btn4.setLabel("four");
		btn5.setLabel("five");
		btn6.setLabel("six");
		
		GridBagConstraints bag = new GridBagConstraints();
		bag.fill=GridBagConstraints.BOTH;
		bag.gridwidth=1;
		bag.gridheight=1;
		
		bag.weightx=1.0;
		bag.weighty=1.0;
		
		bag.gridx=0;
		bag.gridy=0;
		add(btn1,bag);
		bag.gridx=1;
		add(btn2,bag);
		bag.gridx=2;
		add(btn3,bag);
		bag.gridx=0;
		bag.gridy=1;
		add(btn4,bag);
		bag.gridx=1;
//		bag.gridwidth=2;
		add(btn5,bag);
		bag.gridx=2;
		add(btn6,bag);
		
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();
	}
	
}
