package com.day13;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex02 extends Frame implements WindowListener{
	public Ex02() {
		addWindowListener(this);
		setBounds(1680/2,100,400,300);
		setVisible(true);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창 열림");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");
//		setVisible(false);
//		System.exit(0);
		dispose();	//GUI 종료
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("종료 시 후행작업");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("창 최소화");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창 최소화 복귀");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창 선택");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창 선택해제");
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
