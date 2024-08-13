package com.day13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex11 extends Frame implements ActionListener{
	TextField tf;
	public Ex11() {
		
		setLayout(new BorderLayout());
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		tf = new TextField();
		tf.setFont(new Font(Font.SERIF, Font.BOLD, 20));
		add(tf,BorderLayout.NORTH);
		
		Panel center = new Panel();
		center.setLayout(new GridLayout(4,4,5,5));
		String[] arr1 = new String[]{
				"ESC","/","*","+",
				"1","2","3","-",
				"4","5","6","=",
				"7","8","9","0"
		};
		
		for(int i=0;i<16;i++) {
			Button btn = new Button(arr1[i]);
			btn.addActionListener(this);
			center.add(btn);
		}
		
		
		add(center, BorderLayout.CENTER);
		setBounds(500,50,500,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = e.getActionCommand();
		String before = tf.getText();
		
		tf.setText(tf.getText()+e.getActionCommand());
		System.out.println(e.getActionCommand());
		
		
		if(msg.equals("ESC")) {
			tf.setText("");
			return;
		}
		if(msg.equals("=")) {
			String[][] sus = new String[4][];
			sus[0] = before.split("\\+");
			sus[1] = before.split("\\-");
			sus[2]= before.split("\\*");
			sus[3] = before.split("\\/");
			
			for(int i=0;i<sus.length;i++) {
				String[] su = sus[i];
				if(su.length==2) {
					switch(i) {
					case 0:
						tf.setText(Integer.parseInt(su[0])+Integer.parseInt(su[1])+"");
						break;
					case 1:
						tf.setText(Integer.parseInt(su[0])-Integer.parseInt(su[1])+"");
						break;
					case 2:
						tf.setText(Integer.parseInt(su[0])*Integer.parseInt(su[1])+"");
						break;
					case 3:
						tf.setText(div(Integer.parseInt(su[0]),Integer.parseInt(su[1]))+"");
						break;
					default:
						break;
					}// end switch
				}// end if length
			}//end for
			return;
		}//end if = 
		tf.setText(before+e.getActionCommand());		
	}// end actionPerformed

	public Number div(int a , int b) {
		if(a%b==0)return a/b;
		return a*1.0/b;
	}
	
	
}
