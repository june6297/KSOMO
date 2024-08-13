package com.day13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Ex14 implements ActionListener{
	List<String[]> data=new ArrayList<>();
	static TextField[] adds;
	static Panel center=new Panel();
	static Frame f;
	
	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.9.0)
		f=new Frame("학생성적관리프로그램(ver 0.9.0)");
		f.setLayout(new BorderLayout());
		Panel top=new Panel();
		top.setLayout(new FlowLayout());
		center.setLayout(new FlowLayout());
		adds=new TextField[5];
		Label[] las=new Label[] {
				new Label("학번"),
				new Label("이름"),
				new Label("국어"),
				new Label("영어"),
				new Label("수학")
		};
		for(int i=0; i<adds.length; i++) {
			adds[i]=new TextField(3);
			top.add(las[i]);
			top.add(adds[i]);
		}
		Button addBtn=new Button("입력");
		addBtn.addActionListener(new Ex13());
		top.add(addBtn);
		
		
		f.add(top,BorderLayout.NORTH);
		f.add(center,BorderLayout.CENTER);
		f.setBounds(100,50,550,700);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String[] row=new String[] {
				adds[0].getText(),
				adds[1].getText(),
				adds[2].getText(),
				adds[3].getText(),
				adds[4].getText()
		};
		data.add(row);
		centerValid();
		////////////////////////////
//		TextField[] col=new TextField[5];
//		col[0]=new TextField(adds[0].getText(),5);
//		col[1]=new TextField(adds[1].getText(),5);
//		col[2]=new TextField(adds[2].getText(),5);
//		col[3]=new TextField(adds[3].getText(),5);
//		col[4]=new TextField(adds[4].getText(),5);
//		
//		Panel row=new Panel();
//		for(int i=0; i<col.length; i++) {
//			row.add(col[i]);
//		}
//		Button edit=new Button("수정");
//		Button del=new Button("삭제");
//		row.add(edit);
//		row.add(del);
//		center.add(row);
//		for(int i=0; i<adds.length; i++) {
//			adds[i].setText("");
//		}
//		f.validate();
	}
	void centerValid() {
		center.removeAll();
		Panel group1=new Panel();
		group1.add(new Label("학번 "));
		group1.add(new Label("이름              "));
		group1.add(new Label("국어 "));
		group1.add(new Label("영어 "));
		group1.add(new Label("수학 "));
		group1.add(new Label("수정  "));
		group1.add(new Label("삭제"));
		center.add(group1);
		
		for(int i=0; i<data.size(); i++) {
			String[] row=data.get(i);
			Panel group=new Panel();
			group.add(new TextField(row[0]));
			group.add(new TextField(row[1],10));
			group.add(new TextField(row[2]));
			group.add(new TextField(row[3]));
			group.add(new TextField(row[4]));
			Button btn1=new Button("수정");
			group.add(btn1);
			Button btn2=new Button("삭제");
			group.add(btn2);
			center.add(group);
		}
		for(int i=0; i<adds.length; i++)
			adds[i].setText("");
		f.validate();
	}

}