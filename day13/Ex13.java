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

public class Ex13 extends Frame implements ActionListener{
    TextField sn, name, kor, eng, math;
    Button in, edit, del;
    Panel panel, panel2;
    
    public Ex13() {
        setLayout(new BorderLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        
        Panel panel = new Panel(new GridLayout(1, 6));

        sn = new TextField();
        sn.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        panel.add(sn);

        name = new TextField();
        name.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        panel.add(name);

        kor = new TextField();
        kor.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        panel.add(kor);

        eng = new TextField();
        eng.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        panel.add(eng);

        math = new TextField();
        math.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        panel.add(math);

        in = new Button("Input");
        panel.add(in);
        
        add(panel,BorderLayout.NORTH);
        
        TextField[] arr = {sn,name,kor,eng,math};
        
        for(int i=0;i<arr.length;i++) {
        	arr[i].setFont(new Font(Font.SERIF, Font.BOLD, 20));
//        	panel2.add(arr[i]);
        }
        
        
        setBounds(500, 50, 800, 800);
        setVisible(true);
    }
    
    String[][] arr = new String[5][];

    public static void main(String[] args) {
        new Ex13();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}