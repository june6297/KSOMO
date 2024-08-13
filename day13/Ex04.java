package com.day13;

import java.awt.Frame;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex04 extends Frame implements MouseListener{
	JLabel btn;
	
	public Ex04() {
		ImageIcon icon = new ImageIcon("logo.png");
				
		setLayout(null);
		btn = new JLabel();
		btn.setIcon(icon);
		
		btn.setSize(100,50);
		btn.setLocation(100,100);
		
		this.addMouseListener(this);
		add(btn);
		
		setBounds(1680/2,100,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
//		System.out.println(e.getX()+", "+e.getY());
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
//		System.out.println("클릭버튼 누름");
		int x = e.getX();
		int y = e.getY();
		btn.setLocation(x-100/2,y-50/2);
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
//		System.out.println("클릭버튼 위로");

	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
//		System.out.println("마우스가 위로");

	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
//		System.out.println("마우스가 밖으로");

	}
}
