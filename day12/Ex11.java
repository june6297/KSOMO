package com.day12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex11 {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		
		Panel p = new Panel();
//		p.setLayout(new FlowLayout());
		p.setBackground(Color.pink);
		
		Button btn = new Button("button");
		Font font = Font.getFont(Font.DIALOG);
		btn.setFont(font);
		btn.setBackground(Color.white);
		btn.setForeground(Color.blue);
		
		JButton btn2 = new JButton("button");
		btn2.setFont(Font.getFont("궁서체"));
		
		Icon defaultIcon = new ImageIcon("logo.png");
		btn2.setIcon(defaultIcon);
		
//		p.add(btn);
		p.add(btn2);
		f.add(p);
		f.setTitle("제목없음");
		f.setSize(500,400);
		f.setVisible(true);
	}
}
