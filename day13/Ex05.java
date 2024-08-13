package com.day13;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex05 extends Frame implements MouseMotionListener{
	JLabel la;
	
	public Ex05() {
		setLayout(null);
		addMouseMotionListener(this);
		ImageIcon icon = new ImageIcon("logo.png");
		la = new JLabel(icon);
//		setSize(icon.getIconWidth()/2,icon.getIconHeight()/2);
		la.setSize(100,50);
		la.setLocation(0,0);
		add(la);
		
		setBounds(1650/2,100,1000,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("드레그");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX()+", "+e.getY());
		int x = e.getX();
		int y = e.getY();
		la.setLocation(x,y);
		
		
	}
}
