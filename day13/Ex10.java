package com.day13;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Ex10 extends Frame implements ActionListener{
	//컴포넌트 고유의 이벤트 실행
	Button btn;
	TextField tf;
	
	
	public Ex10() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setLayout(new FlowLayout());
		btn = new Button("button");
		tf = new TextField(15);
		tf.setEchoChar('#');
		tf.addActionListener(this);
		
//		btn.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("버튼 클릭");
//			}
//		});
		
//		Choice list1 = new Choice();
//		list1.add("item1");
//		list1.add("item2");
//		list1.add("item3");
//		list1.add("item4");
		
		
		btn.addActionListener(e -> System.out.println("버튼 클릭"));
		add(btn);
		add(tf);
		setBounds(1560/2,100,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf)
		System.out.println(e.getActionCommand());
//		if(e.getSource()==btn)
//			System.out.println("버튼 클릭");
	}
	
}
