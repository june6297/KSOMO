package com.day13;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex07 extends Frame implements KeyListener{
	Label la;
	public Ex07() {
		setLayout(new FlowLayout());
		TextField tf = new TextField();
		Button btn = new Button("button");
		la = new Label("*");
		la.setSize(50,50);
		la.addKeyListener(this);
		
		
//		btn.addKeyListener(this);
		
//		add(tf);
		add(la);
//		add(btn);
		
		setBounds(1560/2,100,500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex07();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("call");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==39) {
			int x = this.getWidth();
			if(la.getX()+10<x-10)
			la.setLocation(la.getX()+10,la.getY());
		}
		
		if(e.getKeyCode()==37) {
			if(la.getX()-10>0)
			la.setLocation(la.getX()-10,la.getY());
		}
		
		if(e.getKeyCode()==39) {
			la.setLocation(la.getX()+10,la.getY());
		}
		
		if(e.getKeyCode()==39) {
			la.setLocation(la.getX()+10,la.getY());
		}
	}
}
