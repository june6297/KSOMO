package com.day12;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;

public class Ex14 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		
		TextArea ta=new TextArea("",3,35,TextArea.SCROLLBARS_NONE);
		ta.setFont(new Font("",Font.PLAIN,20));
		f.add(ta);
		
		f.setSize(500,600);
		f.setLocation(100,100);
		f.setVisible(true);
	}
}
